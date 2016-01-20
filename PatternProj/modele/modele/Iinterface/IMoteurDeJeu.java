package modele.Iinterface;

import modele.Personnage;

public interface IMoteurDeJeu {

	/**
	 * Classe permettant de charger le  plateau � utiliser durant la simulation
	 * @param plateau
	 */
	public void chargerPlateau(IPlateau plateau);

	/**
	 * Methode permettant de d�placer un personnage
	 * @param perso
	 */
	public void DeplacementPersonnage(Personnage perso);


	

}
