package controleur.factory;

import controleur.map.PlateauSimuDeplacement;
import modele.Guerrier;
import modele.Monstre;
import modele.Personnage;
import modele.Iinterface.IPlateau;
import modele.Keys.EnumTypePersonnage;

public class SimuDeplacementFactory extends SimulationFactory{

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
	public IPlateau getPlateau() {

		return new PlateauSimuDeplacement();
	}



}
