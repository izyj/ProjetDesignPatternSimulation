package controleur.factory;

import modele.Guerrier;
import modele.Shape;
import modele.Voiture;
import modele.Keys.Keys;

public class ShapeFactory {

	public ShapeFactory() {




	}
	/**
	 * Methode permettant de récuperer un objet de type Shape(Apparence)
	 * @param shapeType
	 * @return Shape
	 */
	public Shape getShape(String shapeType){


		if(shapeType.equalsIgnoreCase(Keys.Shape_Guerrier)){
	        return new Guerrier();
	     } else if(shapeType.equalsIgnoreCase(Keys.Shape_Voiture)){
	        return new Voiture();
	     }

	     return null;
	}
}
