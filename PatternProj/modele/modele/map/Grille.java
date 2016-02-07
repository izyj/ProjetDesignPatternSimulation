package modele.map;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import modele.Guerrier;
import modele.Monstre;
import modele.Personnage;
import modele.Keys.EnumElementPlateau;
import modele.ObjectItem.ObjectItemAbstract;

public class Grille extends JPanel implements Map {


	private List<List<Zone>> grille;


	 public Grille()
     {
			GridLayout grid = new GridLayout(10,10);
			this.setLayout(grid);
			this.setBackground(new Color(255, 228, 196));

			grille = new ArrayList<List<Zone>>();
			Case temp = null;
			for(int colonne = 0; colonne <= 9; colonne++){
				List<Zone> ligneTab = new ArrayList<Zone>();
				
				
				grille.add(ligneTab);
				for(int ligne = 0; ligne <= 9; ligne++){
					if(ligne > 0){
						//temp = (Case) ligne
					}
					// on crée la liste qui va contenir la ligne
					AddZone(ligne, colonne, "M");
				}
				//grille.add(ligneTab);
			}
			lieZone();
     }

	 /**
	  * Cette methode ajoute une case dans la grille
	  */
	public void AddZone(int ligne, int colonne, String typeCase) {

		Dimension dim = new Dimension();
		dim.setSize(20, 20);
		
		Case uneCase = new Case(ligne,colonne);
		uneCase.setMinimumSize(dim);
		
		switch (typeCase) {
	        case "P":  uneCase.changerImageCase(EnumElementPlateau.personnage);
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
//	        default:   uneCase.Afficher();
//	                   break;
		}
		
//		uneCase.changerImageCase(EnumElementPlateau.mur);
		
		this.add(uneCase);
		// on ajoute la case dans le plateau
		grille.get(colonne).add(uneCase);
	}

	/**
	 * Cette methode retourne une case de la grille
	 */
	@Override
	public Zone GetZone(int x, int y, String typeCase) {

		return null;//Zones.get(x).getLiens().get(y);

	}

	@Override
	public void ChargerObjet(List<ObjectItemAbstract> objets, List<Zone> zones ) {

		for  (Zone item  : zones)
			for (ObjectItemAbstract obj :  objets)

				if (obj.getPosition().equals(item)) {
					item.objects.add(obj);
			    }

	}


	/**
	 * Methode qui permet  qui place les personnages au chargement de la grille
	 */
	public void chargerPersonnage(List<Personnage> personages) {

		for (Personnage personnage : personages) {

			if (personnage instanceof Guerrier ) {
				System.out.println("Guerrier");
				grille.get(0).get(0).getPersonages().add(personnage);
				Case uneCase = (Case) grille.get(0).get(0);
				uneCase.changerImageCase(EnumElementPlateau.personnage);
				grille.get(0).get(0).setText("Personnage");

			}else if (personnage instanceof Monstre ) {
				grille.get(0).get(0).getPersonages().add(personnage);
			}

		}
	}


	@Override
	public void supprimerObjet(ObjectItemAbstract obj,List<Zone> zones) {

		for  (Zone item  : zones)

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
		for(int i = 0 ; i<=grille.size()-1; i++){
			//System.out.println(i);
			// colonne
			int b =0;
			boolean secondcase = false;
			for (Zone list : grille.get(i)) {
				/**
				 * Pour lié les cases je verifie tous dabors que la derniere case n'a pas eté sauvegarder ensuite je vérifie que la premiere est passer
				 * et ensuite je les la case x a la x-1
				 */
				if(temp != null){
					grille.get(i).get(b).getLiens().add(temp);
					temp = null;
				}
				if(secondcase){
					grille.get(i).get(b--).getLiens().add(list);
					b++;
				 }
				 if(b == grille.get(i).size()-1){
					temp = list;
				 }
				}

			}
	}






}
