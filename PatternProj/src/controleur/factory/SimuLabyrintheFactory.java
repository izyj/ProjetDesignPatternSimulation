package controleur.factory;

import controleur.map.PlateauLabyrinthe;
import modele.Personnage;
import modele.Keys.EnumTypePersonnage;
import modele.map.IPlateau;

public class SimuLabyrintheFactory extends SimulationFactory{


	@Override
	public Personnage getPersonnage(EnumTypePersonnage personnage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPlateau getPlateau() {

	     return new PlateauLabyrinthe();
	}

}
