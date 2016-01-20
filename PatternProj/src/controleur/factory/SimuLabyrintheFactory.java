package controleur.factory;

import controleur.map.PlateauLabyrinthe;
import modele.Personnage;
import modele.Iinterface.IPlateau;
import modele.Keys.EnumTypePersonnage;

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
