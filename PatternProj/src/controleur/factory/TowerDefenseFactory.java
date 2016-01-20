package controleur.factory;

import controleur.map.PlateauTowerDefense;
import modele.Personnage;
import modele.Keys.EnumTypePersonnage;
import modele.map.IPlateau;

public class TowerDefenseFactory extends SimulationFactory{

	@Override
	public Personnage getPersonnage(EnumTypePersonnage personnage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPlateau getPlateau() {

		return new PlateauTowerDefense();
	}

}
