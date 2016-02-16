package modele.map;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.swing.JPanel;

import utils.GestionXML;
import modele.Coordonnees;
import modele.Guerrier;
import modele.Monstre;
import modele.Personnage;
import modele.Keys.EnumElementPlateau;
import modele.ObjectItem.ObjectItemAbstract;

public class Grille extends JPanel implements Map {

	private List<List<Zone>> grille;
	private List<Personnage> listPersonnage;

	public Grille(String path) {
		GridLayout grid = new GridLayout(10, 10);
		this.setLayout(grid);
		this.setBackground(new Color(255, 228, 196));
		listPersonnage = new ArrayList<>();
		grille = new ArrayList<List<Zone>>();

		Hashtable<Coordonnees, String> tabMap = GestionXML.lectureFichierXML(path);
		Hashtable<String, Integer> dim = GestionXML.getDimensionCarte();

		for (int x = 0; x <= dim.get("x"); x++) {
			List<Zone> ligneTab = new ArrayList<Zone>();
			grille.add(ligneTab);
			for (int y = 0; y <= dim.get("y"); y++) {
				Coordonnees coor = new Coordonnees();
				coor.setX(x);
				coor.setY(y);
				AddZone(y, x, tabMap.get(coor));
				
			}
		}
		lieZone();
	}


	/**
	 * Cette methode ajoute une case dans la grille
	 */
	public void AddZone(int ligne, int colonne, String typeCase) {

		Dimension dim = new Dimension();
		dim.setSize(40, 40);

		Case uneCase = new Case(ligne, colonne);
		uneCase.setMinimumSize(dim);
		
		if(typeCase != null){
			switch (typeCase) {
		        case "P":  	uneCase.changerImageCase(EnumElementPlateau.personnage);
		        			Personnage  guerrier = (Guerrier)GestionXML.getPersonnage();
		        			guerrier.setPositionLigne(ligne);
		        			guerrier.setPositionColonne(colonne);
		           		   	listPersonnage.add(guerrier);
		                   break;
		        case "*":  uneCase.changerImageCase(EnumElementPlateau.mur);
		        	       break;
		        case "N":  uneCase.changerImageCase(EnumElementPlateau.nourriture);
		                   break;
		        case "A":  uneCase.changerImageCase(EnumElementPlateau.arme);
		                   break;
		        case "F":  uneCase.changerImageCase(EnumElementPlateau.fin);
		        		   break;
		        case "T":  uneCase.changerImageCase(EnumElementPlateau.tour);
				           break;
		        case "M":  uneCase.changerImageCase(EnumElementPlateau.monstre);
		                   break;
		        default:   uneCase.changerImageCase(EnumElementPlateau.sol);
		                   break;
		    }	
		}
			
		this.add(uneCase);
		// on ajoute la case dans le plateau
		grille.get(colonne).add(uneCase);
	}

	/**
	 * Cette methode retourne une case de la grille
	 */
	@Override
	public Zone GetZone(int x, int y, String typeCase) {

		return null;// Zones.get(x).getLiens().get(y);

	}

	@Override
	public void ChargerObjet(List<ObjectItemAbstract> objets, List<Zone> zones) {

		for (Zone item : zones)
			for (ObjectItemAbstract obj : objets)

				if (obj.getPosition().equals(item)) {
					item.objects.add(obj);
				}

	}

	/**
	 * Methode qui permet qui place les personnages au chargement de la grille
	 */
	public void chargerPersonnage(List<Personnage> personages) {
		Case uneCase = null;
		for (Personnage personnage : personages) {

			if (personnage instanceof Guerrier) {
				System.out.println("Guerrier");
				grille.get(0).get(0).getPersonages().add(personnage);
				uneCase = (Case) grille.get(0).get(0);
				uneCase.changerImageCase(EnumElementPlateau.personnage);
				grille.get(0).get(0).setText("Personnage");

			} else if (personnage instanceof Monstre) {
				grille.get(1).get(1).getPersonages().add(personnage);
				uneCase = (Case) grille.get(1).get(1);
				uneCase.changerImageCase(EnumElementPlateau.monstre);
			}

		}
	}

	@Override
	public void supprimerObjet(ObjectItemAbstract obj, List<Zone> zones) {

		for (Zone item : zones)

			if (zones.contains(obj)) {
				item.objects.remove(obj);
			}
	}

	@Override
	public void supprimePersonnage(Personnage perso) {

	}

	@Override
	public void ajouterPersonnageInZone(Personnage perso, Zone position) {

	}

	@Override
	public void afficherEnvironment(Personnage personage) {

	}

	@Override
	public List<List<Zone>> recupererGrille() {

		return this.grille;
	}

	/**
	 * Méthode qui lie les zones ( chemins possible)
	 */
	@Override
	public void lieZone() {
		Zone temp = null;
		for (int i = 0; i <= grille.size() - 1; i++) {
			// System.out.println(i);
			// colonne
			int b = 0;
			boolean secondcase = false;
			for (Zone list : grille.get(i)) {
				/**
				 * Pour lié les cases je verifie tous dabors que la derniere
				 * case n'a pas eté sauvegarder ensuite je vérifie que la
				 * premiere est passer et ensuite je les la case x a la x-1
				 */
				if (temp != null) {
					grille.get(i).get(b).getLiens().add(temp);
					temp = null;
				}
				if (secondcase) {
					grille.get(i).get(b--).getLiens().add(list);
					b++;
				}
				if (b == grille.get(i).size() - 1) {
					temp = list;
				}
			}

		}
	}


	public List<List<Zone>> getGrille() {
		return grille;
	}


	public void setGrille(List<List<Zone>> grille) {
		this.grille = grille;
	}


	public List<Personnage> getListPersonnage() {
		return listPersonnage;
	}


	public void setListPersonnage(List<Personnage> listPersonnage) {
		this.listPersonnage = listPersonnage;
	}
	
	

}
