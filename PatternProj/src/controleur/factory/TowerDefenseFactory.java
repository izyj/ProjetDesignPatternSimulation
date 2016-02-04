package controleur.factory;

import modele.Personnage;
import modele.Iinterface.IPlateau;
import modele.Keys.EnumTypePersonnage;
import vue.PlateauTowerDefense;

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
