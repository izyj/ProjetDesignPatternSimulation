package controleur.factory;

import modele.Keys.EnumPlateauJeu;
import modele.Keys.EnumTypePersonnage;
import modele.Personage.Personnage;
import modele.map.Plateau;

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
	public abstract Plateau getPlateau();



}
