package controleur.factory;

import controleur.map.PlateauSimuDeplacement;
import modele.Guerrier;
import modele.Monstre;
import modele.Personnage;
import modele.Iinterface.IPlateau;
import modele.Keys.EnumTypePersonnage;
import modele.ObjectItem.ObjEnum;
import modele.ObjectItem.ObjectItemAbstract;
import modele.ObjectItem.piege;
import modele.map.Zone;

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
	public IPlateau getPlateau() {

		return new PlateauSimuDeplacement();
	}

	/**
	 * Methode permettant de récuperer un objets de type piege
	 * @param ObjEnum
	 * @return ObjectItemAbstract
	 */
	public ObjectItemAbstract CreateObject(ObjEnum typeOfObject, String name, Zone position)  {

		ObjectItemAbstract ObjectItemAbstract = null;

		if(typeOfObject.equals(ObjEnum.piege)){
	        return new piege(name, position);
	    }else if(typeOfObject.equals(ObjEnum.eau)){
		    return null;
		 }

		  switch (typeOfObject)
      {
          case piege:
              return new piege(name, position);
          case eau:
              return null;


      }
		return ObjectItemAbstract ;
  }

}
