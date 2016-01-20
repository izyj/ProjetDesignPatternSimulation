package controleur.factory;

import modele.Personnage;
import modele.Keys.EnumTypePersonnage;
import modele.map.IPlateau;

public abstract class SimulationFactory {


	/**
	 * Methode permettant de r�cuperer un objet de type Personnage(Apparence)
	 * @param EnumTypePersonnage
	 * @return Personnage
	 */
	public abstract Personnage getPersonnage(EnumTypePersonnage personnage);

	/**
	 * Methode permettant de r�cuperer le plateau de la simulation
	 * @param simulation
	 * @return Plateau
	 */
	public abstract IPlateau getPlateau();



}
