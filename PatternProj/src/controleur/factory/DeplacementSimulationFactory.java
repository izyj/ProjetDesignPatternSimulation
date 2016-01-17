package controleur.factory;

import modele.Guerrier;
import modele.Monstre;
import modele.Keys.EnumPlateauJeu;
import modele.Keys.EnumTypePersonnage;
import modele.Personage.Personnage;
import modele.map.Plateau;
import modele.map.PlateauSimuDeplacement;

public class DeplacementSimulationFactory extends SimulationFactory{

	/**
	 * Methode permettant de récuperer un objet de type Personnage(Apparence)
	 * @param EnumTypePersonnage
	 * @return IPersonnage
	 */
	public Personnage getPersonnage(EnumTypePersonnage personnage){

		Personnage PersonnageCree = null;
		if(personnage.equals(EnumTypePersonnage.Guerrier)){
	        return new Guerrier();
	    }else if(personnage.equals(EnumTypePersonnage.Monstre)){
		    return new Monstre();
		 }

	     return PersonnageCree;
	}

	@Override
	public Plateau getPlateau() {

		return new PlateauSimuDeplacement();
	}



}
