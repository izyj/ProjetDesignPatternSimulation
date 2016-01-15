package controleur.factory;

import modele.Guerrier;
import modele.Voiture;
import modele.Iinterface.IPersonnage;
import modele.Keys.EnumTypePersonnage;

public class PersonnageFactory {

	public PersonnageFactory() {




	}
	/**
	 * Methode permettant de récuperer un objet de type Shape(Apparence)
	 * @param shapeType
	 * @return Shape
	 */
	public IPersonnage getShape(EnumTypePersonnage personnage){


		if(personnage.equals(EnumTypePersonnage.Guerrier)){
	        return new Guerrier();
	     } else if(personnage.equals(EnumTypePersonnage.Voiture)){
	        return new Voiture();
	     }

	     return null;
	}
}
