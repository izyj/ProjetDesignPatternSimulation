package modele.Iinterface;

import controleur.etat.AutomateEtat;

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
	public void deplacementPersonnage();


	/**
	 * Methode qui va charger les personnages
	 */
	public void chargerPersonnage();

	


}
