package controleur.factory;

import modele.Personnage;
import modele.Keys.EnumTypePersonnage;
import modele.map.Plateau;
import modele.map.PlateauLabyrinthe;

public class SimuLabyrintheFactory extends SimulationFactory{


	@Override
	public Personnage getPersonnage(EnumTypePersonnage personnage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plateau getPlateau() {

	     return new PlateauLabyrinthe();
	}

}
