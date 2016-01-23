package modele.map;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

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
			//Border border = LineBorder.createGrayLineBorder();
			grille = new ArrayList<List<Zone>>();

			for(int colonne = 0; colonne <= 9; colonne++){
				List<Zone> ligneTab = new ArrayList<Zone>();
				grille.add(ligneTab);
				for(int ligne = 0; ligne <= 9; ligne++){

					// on crée la liste qui va contenir la ligne
					AddZone(ligne, colonne);
				}
				grille.add(ligneTab);
			}

     }
	 /**
	  * Cette methode ajoute une case dans la grille
	  */
	@Override
	public void AddZone(int ligne, int colonne) {

		Case uneCase = new Case(ligne,colonne);
		uneCase.setBorder(BorderFactory.createLineBorder(Color.RED,1));
		uneCase.setText("test");
		this.add(uneCase);
		grille.get(colonne).add(uneCase);
	}

	/**
	 * Cette methode retourne une case de la grille
	 */
	@Override
	public Zone GetZone(int x, int y) {

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
