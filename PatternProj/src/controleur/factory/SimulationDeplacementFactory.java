package controleur.factory;

import modele.Guerrier;
import modele.Monstre;
import modele.Iinterface.IPersonnage;
import modele.Keys.EnumTypePersonnage;

public class SimulationDeplacementFactory {

	public SimulationDeplacementFactory() {




	}
	/**
	 * Methode permettant de récuperer un objet de type Personnage(Apparence)
	 * @param EnumTypePersonnage
	 * @return IPersonnage
	 */
	public IPersonnage getPersonnage(EnumTypePersonnage personnage){


		if(personnage.equals(EnumTypePersonnage.Guerrier)){
	        return new Guerrier();
	    }else if(personnage.equals(EnumTypePersonnage.Monstre)){
		        return new Monstre();
		 }

	     return null;
	}




}
