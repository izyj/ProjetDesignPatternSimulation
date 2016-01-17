package controleur.factory;

import modele.Guerrier;
import modele.Monstre;
import modele.Keys.EnumPlateauJeu;
import modele.Keys.EnumTypePersonnage;
import modele.Personage.Personnage;
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
