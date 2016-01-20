package controleur.factory;

import controleur.map.PlateauTowerDefense;
import modele.Personnage;
import modele.Iinterface.IPlateau;
import modele.Keys.EnumTypePersonnage;

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
