package modele.Iinterface;

import modele.Personnage;

public interface IMoteurDeJeu {

	/**
	 * Classe permettant de charger le  plateau à utiliser durant la simulation
	 * @param plateau
	 */
	public void chargerPlateau(IPlateau plateau);

	/**
	 * Methode permettant de déplacer un personnage
	 * @param perso
	 */
	public void DeplacementPersonnage(Personnage perso);


	

}
