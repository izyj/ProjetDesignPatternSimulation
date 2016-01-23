package modele.Iinterface;

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
	public void DeplacementPersonnage();


	/**
	 * Methode qui va charger les personnages
	 */
	public void ChargerPersonnage();

	


}
