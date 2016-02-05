package controleur.moteurJeu;

import java.util.ArrayList;
import java.util.List;

import controleur.contexte.ContexteSimulation;
import controleur.etat.EtatPersonnageDeplacement;
import controleur.factory.SimuDeplacementFactory;
import modele.Guerrier;
import modele.Monstre;
import modele.Personnage;
import modele.Iinterface.IMoteurDeJeu;
import modele.Iinterface.IObservable;
import modele.Iinterface.IObservateur;
import modele.Iinterface.IPlateau;
import modele.Keys.EnumElementPlateau;
import modele.Keys.EnumTypePersonnage;
import modele.map.Case;
import modele.map.Grille;
import modele.map.Zone;

public class MoteurSimuDeplacement extends Thread implements IMoteurDeJeu, IObservable {


	private Grille grille;
	private List<Personnage> listePersonnages;
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
	    // boucle  durée de vie du thread 
	    while( System.currentTimeMillis() < ( start + (10000 * 10))) {

	    	deplacementPersonnage();

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


		System.out.println(hero.getPositionX());
		// Je recupère la position du personnage et je l'incrémente afin qui se déplace dans les cases.
		 newPositionY = hero.getPositionY();
		 newPositionX = hero.getPositionX() +1;
		if(newPositionX == 9){
			 newPositionY++;
			 newPositionX=0;
		}
		hero.setEtatPersonnage(new EtatPersonnageDeplacement());
		List<List<Zone>> plateau;
		notifierObservateurs();
		
		// on vérifie que des ennemies ne sont pas present
		//verifierEnemiesPresent(hero,grille.recupererGrille());

	}

	/**
	 * Cette methode verifie si des enemies sont present dans les cases suivantes
	 * 
	 */
	private void verifierEnemiesPresent(Personnage hero,List<List<Zone>> plateau){
		Monstre tempShape = null;
		//on vérifie d'abord que l'on ne regarde pas une case depassant le tableau
		if(hero.getPositionX() <= plateau.get(hero.getPositionX()).size()){
			//on vérifie qu'un monstre se trouve dans la prochaine case
			Zone temp =  plateau.get(hero.getPositionX()).get(hero.getPositionY()+1);
			if(!temp.getPersonages().isEmpty()){
				
				if(temp.getPersonages().get(0) instanceof  Monstre){
					
					tempShape = (Monstre) temp.getPersonages().get(0);
					
					hero.actionAttaquer(tempShape);
					listePersonnages.add(temp.getPersonages().get(0));
					notifierObservateurs();
				}
				
			}
			else{
				// pour les attaques a distance on vérifie qu'un monstre ne se trouve pas 4 cases devant
				temp =  plateau.get(hero.getPositionX()).get(hero.getPositionY()+4);
				if(!temp.getPersonages().isEmpty()){
					int min =0;
					int max = 10;
					// On génere un nombre aléatoire le guerrier ne regardera pas tous le temps a distance
					int nombreAleatoire = min + (int)(Math.random() * ((max - min) + 1));	
					if(temp.getPersonages().get(0) instanceof  Monstre && nombreAleatoire >=  5){
						
						tempShape = (Monstre) temp.getPersonages().get(0);
						
						hero.actionAttaquer(tempShape);
						listePersonnages.add(temp.getPersonages().get(0));
						notifierObservateurs();
					}
				
				
					
			}
		}
		}

	}

	/**
	 * Methode qui permet au personnage de se déplacer (seul le héros se déplace)
	 */
	@Override
	public void deplacementPersonnage() {

		for (Personnage personnage : listePersonnages) {

			if (personnage instanceof Guerrier) {
				 deplacementHeros(personnage);
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
		listePersonnages = new ArrayList<>();
		listePersonnages.add(perso);
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
		newPositionY = newPositionY;
	}


	public int getNewPositionX() {
		return newPositionX;
	}


	public void setNewPositionX(int newPositionX) {
		newPositionX = newPositionX;
	}


	
	

}
