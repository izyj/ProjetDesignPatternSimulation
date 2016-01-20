package modele.map;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import modele.Personnage;
import modele.ObjectItem.ObjectItemAbstract;

public class Grille extends JPanel implements Map {


	public List<Zone> Zones;

	 public Grille()
     {
			GridLayout grid = new GridLayout(10,30);
			this.setLayout(grid);
			//Border border = LineBorder.createGrayLineBorder();
			Zones = new ArrayList<Zone>();
			for(int i = 1; i <= 10; i++){

				for(int b = 1; b <= 10; b++){
					Case uneCase = new Case(i,b, Zones, null, null);
					uneCase.setBorder(BorderFactory.createLineBorder(Color.RED,1));
					uneCase.setText("test");
					this.add(uneCase);


				}
			}
         Zones = new ArrayList<Zone>();

     }
	 /**
	  * Cette methode ajoute une case dans la grille
	  */
	@Override
	public void AddZone(int x, int y) {

		Zones.get(x).getLiens().add(new Case(x, y, Zones, null, null));
	}

	/**
	 * Cette methode retourne une case dans la grille
	 */
	@Override
	public Zone GetZone(int x, int y) {

		return Zones.get(x).getLiens().get(y);

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


}
