package modele.map;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import vue.utils.gestionImages;
import modele.Guerrier;
import modele.Monstre;
import modele.Personnage;
import modele.ObjectItem.ObjectItemAbstract;

public class Grille extends JPanel implements Map {


	private List<List<Zone>> grille;


	 public Grille()
     {
			GridLayout grid = new GridLayout(10,10);
			this.setLayout(grid);
			this.setBackground(new Color(255, 228, 196));
	
			grille = new ArrayList<List<Zone>>();

			for(int colonne = 0; colonne <= 9; colonne++){
				List<Zone> ligneTab = new ArrayList<Zone>();
				grille.add(ligneTab);
				for(int ligne = 0; ligne <= 9; ligne++){

					// on cr�e la liste qui va contenir la ligne
					AddZone(ligne, colonne, "*");

				}
				grille.add(ligneTab);
			}
     }
	 
	 /**
	  * Cette methode ajoute une case dans la grille
	  */
	public void AddZone(int ligne, int colonne, String typeCase) {

		Case uneCase = new Case(ligne,colonne);
		uneCase.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		
		switch (typeCase) {
	        case "P":  uneCase.setIcon(new ImageIcon(gestionImages.getPersonnage()));
	                   break;
	        case "*":  uneCase.setIcon(new ImageIcon(gestionImages.getMur()));
	        	       break;
	        case "N":  uneCase.setIcon(new ImageIcon(gestionImages.getNourriture()));
                       break;
	        case "A":  uneCase.setIcon(new ImageIcon(gestionImages.getArme()));
                       break;
	        case "F":  uneCase.setIcon(new ImageIcon(gestionImages.getFin()));
            		   break;
	        case "T":  uneCase.setIcon(new ImageIcon(gestionImages.getTour()));
 		               break;
	        case "M":  uneCase.setIcon(new ImageIcon(gestionImages.getMonstre()));
                       break;
	        default:   uneCase.Afficher();
                       break;
	    }
		
		this.add(uneCase);
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
	public void ChargerPersonage(List<Personnage> personages) {

		for (Personnage personnage : personages) {

			if (personnage instanceof Guerrier ) {
				System.out.println("Guerrier");
				grille.get(0).get(0).getPersonages().add(personnage);
				grille.get(0).get(0).setText("Personnage");

			}else if (personnage instanceof Monstre ) {
				grille.get(0).get(0).getPersonages().add(personnage);
			}

		}
	}


	@Override
	public void SupprimerObjet(ObjectItemAbstract obj,List<Zone> zones) {

		for  (Zone item  : zones)

			if (zones.contains(obj)) {
				item.objects.remove(obj);
		    }
	}

	@Override
	public void SupprimePersonage(Personnage perso) {

	}

	@Override
	public void AjouterPersonageInZone(Personnage perso, Zone position) {

	}

	@Override
	public void AfficherEnvironment(Personnage personage) {

	}
	@Override
	public List<List<Zone>> recupererGrille() {

		return this.grille;
	}



}
