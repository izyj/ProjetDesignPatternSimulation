package controleur.moteurJeu;

import java.util.ArrayList;
import java.util.List;

import controleur.factory.SimuDeplacementFactory;
import modele.Guerrier;
import modele.Personnage;
import modele.Iinterface.IMoteurDeJeu;
import modele.Iinterface.IObservable;
import modele.Iinterface.IObservateur;
import modele.Iinterface.IPlateau;
import modele.Keys.EnumTypePersonnage;
import modele.map.Grille;
import modele.map.Zone;

public class MoteurSimuDeplacement extends Thread implements IMoteurDeJeu, IObservable {


	Grille grille;
	List<Personnage> listePersonnages;
	SimuDeplacementFactory factory;

	public MoteurSimuDeplacement(Grille plateau) {
		this.grille = plateau;
		this.factory = new SimuDeplacementFactory();
	}


	@Override
	public void run() {
		long start = System.currentTimeMillis();
	    // boucle tant que la durée de vie du thread est < à 5 secondes
	    while( System.currentTimeMillis() < ( start + (1000 * 50))) {

	    	DeplacementPersonnage();

	      try {
	        // pause
	        Thread.sleep(500);
	      }
	      catch (InterruptedException ex) {}
	    }



	}

	@Override
	public void chargerPlateau(IPlateau plateau) {
		// TODO Auto-generated method stub

	}


	@Override
	public void ajouterObservateur(IObservateur observateur) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerObservateur(IObservateur observateur) {
		// TODO Auto-generated method stub

	}

	@Override
	public void notifierObservateurs() {
		// TODO Auto-generated method stub

	}

	/**
	 * Methode gerant le deplacement du personnage
	 */
	private void deplacementHeros(Personnage hero){


		hero.getPositionX();
		List<List<Zone>> plateau;

		plateau = grille.recupererGrille();



	}

	private void verifierEnemiesPresent(){


	}

	/**
	 * Methode qui permet au personnage de se déplacer (seul le héros se déplace)
	 */
	@Override
	public void DeplacementPersonnage() {

		for (Personnage personnage : listePersonnages) {

			if (personnage instanceof Guerrier) {
				 deplacementHeros(personnage);
			}

		}


	}

	/**
	 * Methode qui va permettre de charger les personnages dans la grille
	 */
	@Override
	public void ChargerPersonnage() {
		Personnage perso = factory.getPersonnage(EnumTypePersonnage.Guerrier);
		listePersonnages = new ArrayList<>();
		listePersonnages.add(perso);
		grille.chargerPersonnage(listePersonnages);

	}

}
