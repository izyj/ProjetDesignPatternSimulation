package modele.Iinterface;

public interface IObservable {

	/**
	 * Methode permettant d'abonner un observateur
	 * @param observateur
	 */
	public void ajouterObservateur(IObservateur observateur);

	/**
	 * Methode permettant de supprimer un observateur abonné
	 * @param observateur
	 */
	public void supprimerObservateur(IObservateur observateur);

	/**
	 * Méthode qui notifie a tous les obervervateurs abonné qu'il y'a eu un changement
	 */
	public void notifierObservateurs();

}
