package modele.map;

import java.util.ArrayList;
import java.util.List;

import modele.Personnage;
import modele.ObjectItem.ObjectItemAbstract;

public class Grille extends Map {

	 public Grille()
     {
         Zones = new ArrayList<Zone>();
     }
	@Override
	public void AddZone(int x, int y, int z) {
		Zones.add(new Carre(x, y, z, Zones, null, null)) ;
	}

	@Override
	public Zone GetZone(int x, int y,int z) {
		return null;

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
