package modele.Iinterface;

import controleur.etat.AutomateEtat;

public interface IMoteurDeJeu {

	/**
	 * Classe permettant de charger le  plateau à utiliser durant la simulation
	 * @param plateau
	 */
	public void chargerPlateau(IPlateau plateau);

	/**
	 * Methode permettant de lancer les actions du personnage
	 * @param perso
	 */
	public void traitement();


	/**
	 * Methode qui va charger les personnages
	 */
	public void chargerPersonnage();

	


}
