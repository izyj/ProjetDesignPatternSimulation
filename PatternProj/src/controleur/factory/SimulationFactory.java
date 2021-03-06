package controleur.factory;

import modele.Personnage;
import modele.Iinterface.IPlateau;
import modele.Keys.EnumTypePersonnage;

public abstract class SimulationFactory {


	/**
	 * Methode permettant de récuperer un objet de type Personnage(Apparence)
	 * @param EnumTypePersonnage
	 * @return Personnage
	 */
	public abstract Personnage getPersonnage(EnumTypePersonnage personnage);

	/**
	 * Methode permettant de récuperer le plateau de la simulation
	 * @param simulation
	 * @return Plateau
	 */
	public abstract IPlateau getPlateau();



}
