package controleur.etat;

import java.util.ArrayList;
import java.util.List;

import controleur.moteurJeu.MoteurSimuDeplacement;
import modele.Guerrier;
import modele.Monstre;
import modele.Personnage;
import modele.Comportement.Combat.ComportementAvecCouteau;
import modele.Comportement.Combat.ComportementDeMonstre;
import modele.Iinterface.IObservable;
import modele.Iinterface.IObservateur;
import modele.map.Zone;

public class EtatPersonnageDeplacement implements IEtatPersonnage, IObservable {

	private MoteurSimuDeplacement moteur;
	private List<IObservateur> listObservateur = new ArrayList<>();
	@Override
	public void actionDormir(AutomateEtat context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionSeReveiller(AutomateEtat context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionManger(AutomateEtat context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionMort(AutomateEtat context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPersoAttaque(AutomateEtat context) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPersoImmobile(AutomateEtat context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPersoEnDeplacement(AutomateEtat context) {
		
		ajouterObservateur((IObservateur)context.getMoteur());
		
		if(context.getMoteur() instanceof MoteurSimuDeplacement){
			Guerrier hero = null;
			// Je recup�re la position du personnage et je l'incr�mente afin qui se d�place dans les cases.
				moteur = (MoteurSimuDeplacement) context.getMoteur();
				for (Personnage personnage : moteur.getListePersonnages()) {

					if (personnage instanceof Guerrier) {
						hero = (Guerrier) personnage;
					}

				}
				//System.out.println(hero.getPositionX());
				//System.out.println(moteur.getNewPositionY());
				moteur.setNewPositionY(hero.getPositionY()) ;
				moteur.setNewPositionX(hero.getPositionX() +1);
				System.out.println(moteur.getNewPositionX());
				if(moteur.getNewPositionX() == 10 ){
					moteur.setNewPositionY(moteur.getNewPositionY()+1);
					 moteur.setNewPositionX(0);
				}
				
				verifierEnemiesPresent(hero,moteur.getGrille().recupererGrille(),context);
				
		}
		
	}
	
	/**
	 * Cette methode verifie si des enemies sont present dans les cases suivantes
	 * 
	 */
	private void verifierEnemiesPresent(Personnage hero,List<List<Zone>> plateau,AutomateEtat context){

		Monstre tempShape = null;
		int min =0;
		int max = 10;
		Zone temp = null;
		int nombreAleatoire = min + (int)(Math.random() * ((max - min) + 1));	
		
		// pour les attaques a distance on v�rifie qu'un monstre ne se trouve pas 4 cases devant
		//on v�rifie que l'indice de la case n'est pas plus important que la taille du tableau
		if(hero.getPositionX()+4 <= plateau.get(hero.getPositionX()).size()-1){
			temp =  plateau.get(hero.getPositionX()+4).get(hero.getPositionY());
			
			// On g�nere un nombre al�atoire le guerrier ne regardera pas tous le temps a distance
			if(nombreAleatoire >=  5){
				System.out.println("nb aleatoire : "+nombreAleatoire);
				changementEtatConflit(temp,hero,tempShape,context);	
			}
		}else if(hero.getPositionX()+4 > plateau.get(hero.getPositionX()).size()-1){
			// si il arrive en bout de plateau il regarde dans la ligne suivante
			int reste = (plateau.get(hero.getPositionX()).size()-1)-hero.getPositionX();
			temp =  plateau.get(reste).get(hero.getPositionY()+1);
			changementEtatConflit(temp,hero,tempShape,context);	
			
		}
		//on v�rifie d'abord que l'on ne regarde pas une case depassant le tableau
		if(hero.getPositionX() < plateau.get(hero.getPositionX()).size()-1){
			//on v�rifie qu'un monstre se trouve dans la prochaine case
			temp =  plateau.get(hero.getPositionX()+1).get(hero.getPositionY());
			changementEtatConflit(temp,hero,tempShape,context);
		}

	}

	/**
	 * Methode permettant de changer l'etat des personnage et de no
	 * @param temp
	 * @param heros
	 * @param tempShape
	 * @param context
	 */
	private void changementEtatConflit(Zone temp,Personnage heros, Monstre tempShape,AutomateEtat context){
		
		if(!temp.getPersonages().isEmpty()){
			
			if(temp.getPersonages().get(0) instanceof  Monstre){
				
				tempShape = (Monstre) temp.getPersonages().get(0);
				tempShape.setComportementCombat(new ComportementDeMonstre(tempShape));
				tempShape.setContexteEtat(context);
				heros.setComportementCombat(new ComportementAvecCouteau(tempShape));
				heros.getContexteEtat().changerEtat(new EtatPersonnageConflit(heros, tempShape));
				
			}
		}
		else{
			if(!temp.getPersonages().isEmpty()){
			
				notifierObservateurs();		
		}	
	}
		
	}
	@Override
	public void ajouterObservateur(IObservateur observateur) {
		
		listObservateur.add(observateur);
	}

	@Override
	public void supprimerObservateur(IObservateur observateur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifierObservateurs() {
		
		for (IObservateur iObservateur : listObservateur) {
			iObservateur.actualiser(this);
		}
		
	}


	
	

}
