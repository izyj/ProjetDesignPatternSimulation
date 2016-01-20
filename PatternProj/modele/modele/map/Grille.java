package modele.map;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import modele.Personnage;
import modele.ObjectItem.ObjectItemAbstract;

public class Grille extends JPanel implements Map {


	public List<Zone[]> grille;

	 public Grille()
     {
			GridLayout grid = new GridLayout(10,10);
			this.setLayout(grid);
			//Border border = LineBorder.createGrayLineBorder();
			grille = new ArrayList<Zone[]>();
			for(int colonne = 1; colonne <= 10; colonne++){// colonne

				for(int ligne = 1; ligne <= 10; ligne++){//ligne


					Case uneCase = new Case(ligne,colonne);
					uneCase.setBorder(BorderFactory.createLineBorder(Color.RED,1));
					uneCase.setText("test");
					this.add(uneCase);
				}
			}

     }
	 /**
	  * Cette methode ajoute une case dans la grille
	  */
	@Override
	public void AddZone(int x, int y) {

		//grille.get(x).getLiens().add(new Case(x, y, Zones, null, null));
	}

	/**
	 * Cette methode retourne une case de la grille
	 */
	@Override
	public Zone GetZone(int x, int y) {

		return null;//Zones.get(x).getLiens().get(y);

	}

	@Override
	public void ChargerObjet(List<ObjectItemAbstract> objets) {


	}

	@Override
	public void ChargerPersonage(List<Personnage> personages) {

	}

	@Override
	public void SupprimerObjet(ObjectItemAbstract obj) {

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
	public Grille recupererGrille() {
		// TODO Auto-generated method stub
		return null;
	}


}
