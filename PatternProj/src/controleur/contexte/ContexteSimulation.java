package controleur.contexte;
import java.util.List;

import modele.Personnage;
import modele.Iinterface.IObservateur;
import modele.map.Grille;

public class ContexteSimulation {

	private Grille grille;
	private List<Personnage> listPersonnage;
	private IObservateur observateur;


	public ContexteSimulation() {

	}


	public ContexteSimulation(Grille plateau, List<Personnage> list ) {

		this.grille = plateau;
		this.listPersonnage = list;
	}




	public IObservateur getObservateur() {
		return observateur;
	}


	public void setObservateur(IObservateur observateur) {
		this.observateur = observateur;
	}


	public Grille getGrille() {
		return grille;
	}
	public void setGrille(Grille grille) {
		this.grille = grille;
	}
	public List<Personnage> getListPersonnage() {
		return listPersonnage;
	}
	public void setListPersonnage(List<Personnage> listPersonnage) {
		this.listPersonnage = listPersonnage;
	}




}
