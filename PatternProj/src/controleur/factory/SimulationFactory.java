package controleur.factory;

import modele.Guerrier;
import modele.Voiture;
import modele.Iinterface.IPersonnage;
import modele.Keys.EnumTypePersonnage;

public class SimulationFactory {

	public SimulationFactory() {




	}
	/**
	 * Methode permettant de récuperer un objet de type Personnage(Apparence)
	 * @param EnumTypePersonnage
	 * @return IPersonnage
	 */
	public IPersonnage getPersonnage(EnumTypePersonnage personnage){


		if(personnage.equals(EnumTypePersonnage.Guerrier)){
	        return new Guerrier();
	     } else if(personnage.equals(EnumTypePersonnage.Voiture)){
	        return new Voiture();
	     }else if(personnage.equals(EnumTypePersonnage.Monstre)){
		        return new Voiture();
		     }

	     return null;
	}

	


}
