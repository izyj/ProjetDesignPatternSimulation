package modele.Iinterface;

public interface IObservable {

	/**
	 * Methode permettant d'abonner un observateur
	 * @param observateur
	 */
	public void ajouterObservateur(IObservateur observateur);

	/**
	 * Methode permettant de supprimer un observateur abonn�
	 * @param observateur
	 */
	public void supprimerObservateur(IObservateur observateur);

	/**
	 * M�thode qui notifie a tous les obervervateurs abonn� qu'il y'a eu un changement
	 */
	public void notifierObservateurs();

}
