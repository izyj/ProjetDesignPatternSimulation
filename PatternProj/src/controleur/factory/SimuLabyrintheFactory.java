package controleur.factory;

import modele.Personnage;
import modele.Iinterface.IPlateau;
import modele.Keys.EnumTypePersonnage;
import vue.PlateauLabyrinthe;

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
