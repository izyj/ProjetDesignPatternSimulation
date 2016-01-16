package modele.Iinterface;

public interface IObservateur {

	// Méthode appelée automatiquement lorsque l'état (position ou précision) du GPS change.
    public void actualiser(IObservable o);

}
