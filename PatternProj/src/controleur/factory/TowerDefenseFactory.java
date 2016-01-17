package controleur.factory;

import modele.Keys.EnumPlateauJeu;
import modele.Keys.EnumTypePersonnage;
import modele.Personage.Personnage;
import modele.map.Plateau;
import modele.map.PlateauTowerDefense;

public class TowerDefenseFactory extends SimulationFactory{

	@Override
	public Personnage getPersonnage(EnumTypePersonnage personnage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plateau getPlateau() {

		return new PlateauTowerDefense();
	}

}
