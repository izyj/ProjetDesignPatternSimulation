package controleur.moteurJeu;

import java.util.ArrayList;
import java.util.List;

import controleur.contexte.ContexteSimulation;
import controleur.etat.AutomateEtat;
import controleur.etat.EtatPersonnageDeplacement;
import controleur.etat.IActionPersonnage;
import controleur.factory.SimuDeplacementFactory;
import modele.Guerrier;
import modele.Monstre;
import modele.Personnage;
import modele.Iinterface.IMoteurDeJeu;
import modele.Iinterface.IObservable;
import modele.Iinterface.IObservateur;
import modele.Iinterface.IPlateau;
import modele.Keys.EnumTypePersonnage;
import modele.map.Grille;
import modele.map.Zone;

public class MoteurSimuDeplacement extends Thread implements IMoteurDeJeu, IObservable,IActionPersonnage,IObservateur {


	private Grille grille;
	private List<Personnage> listePersonnages;
	private Personnage hero;
	private SimuDeplacementFactory factory;
	private List<IObservateur> listObservateur;
	private int newPositionY;
	private int newPositionX;
	
	public MoteurSimuDeplacement(ContexteSimulation contexte) {
		this.grille = contexte.getGrille();
		listePersonnages = contexte.getListPersonnage();
		this.factory = new SimuDeplacementFactory();
		listObservateur = new ArrayList<>();
		
	}


	@Override
	public void run() {
		long start = System.currentTimeMillis();
		AutomateEtat contexteEtat = new AutomateEtat(this);
		contexteEtat.changerEtat(new EtatPersonnageDeplacement());
		for (Personnage personnage : listePersonnages) {

			if (personnage instanceof Guerrier) {
				personnage.setContexteEtat(contexteEtat);
			}

		}
	    // boucle  durée de vie du thread 
	    while( System.currentTimeMillis() < ( start + (10000 * 10))) {

	    	traitement();
	    	

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
		
		listObservateur.add(observateur);

	}

	@Override
	public void supprimerObservateur(IObservateur observateur) {
		
		listObservateur.remove(observateur);

	}

	@Override
	public void notifierObservateurs() {
		
		 for (IObservateur  observer : listObservateur) {
			observer.actualiser(this);
		}

	}

	/**
	 * Methode gerant le deplacement du personnage
	 */
	private void deplacementHeros(Personnage hero){

			
		
			
			// on vérifie que des ennemies ne sont pas present
			//verifierEnemiesPresent(hero,grille.recupererGrille());
		
	}


	@Override
	public void traitement() {

		for (Personnage personnage : listePersonnages) {

			if (personnage instanceof Guerrier) {
				hero = personnage;
				personnage.getContexteEtat().action();
				notifierObservateurs();
			}

	        
	       
		}
	}
	
	private void actionAttaque(Guerrier hero, Monstre monstre){
		
		hero.actionAttaquer(monstre);
		
	}

	/**
	 * Methode qui va permettre de charger les personnages dans la grille
	 */
	@Override
	public void chargerPersonnage() {
		Personnage perso = factory.getPersonnage(EnumTypePersonnage.Guerrier);
		Personnage monstre = factory.getPersonnage(EnumTypePersonnage.Monstre);
		listePersonnages = new ArrayList<>();
		listePersonnages.add(perso);
		listePersonnages.add(monstre);
		grille.chargerPersonnage(listePersonnages);

	}


	public List<Personnage> getListePersonnages() {
		return listePersonnages;
	}


	public void setListePersonnages(List<Personnage> listePersonnages) {
		this.listePersonnages = listePersonnages;
	}


	public Grille getGrille() {
		return grille;
	}


	public void setGrille(Grille grille) {
		this.grille = grille;
	}


	public SimuDeplacementFactory getFactory() {
		return factory;
	}


	public void setFactory(SimuDeplacementFactory factory) {
		this.factory = factory;
	}


	public List<IObservateur> getListObservateur() {
		return listObservateur;
	}


	public void setListObservateur(List<IObservateur> listObservateur) {
		this.listObservateur = listObservateur;
	}


	public int getNewPositionY() {
		return newPositionY;
	}


	public void setNewPositionY(int newPositionY) {
		this.newPositionY = newPositionY;
	}


	public int getNewPositionX() {
		return newPositionX;
	}


	public void setNewPositionX(int newPositionX) {
		this.newPositionX = newPositionX;
	}


	


	@Override
	public void actualiser(IObservable o) {
		
		notifierObservateurs();
		hero.getContexteEtat().action();
		
	}


	@Override
	public void actionDormir() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionSeReveiller() {
		
		
	}


	@Override
	public void actionManger() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPersoAttaqueCorpsACorps() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPersoSeDeplace() {
		// TODO Auto-generated method stub
		
	}


	
	

}
