package controleur.etat;

import controleur.moteurJeu.MoteurSimuDeplacement;
import modele.Guerrier;
import modele.Personnage;
import modele.Iinterface.IObservable;
import modele.Iinterface.IObservateur;

public class EtatPersonnageManger implements IEtatPersonnage, IObservable {

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
		MoteurSimuDeplacement moteur = (MoteurSimuDeplacement) context.getMoteur();
		for(Personnage perso : moteur.getListePersonnages()){
			if(perso instanceof Guerrier){
				Guerrier guerrier = (Guerrier) perso;
				
			}
		}
		
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

}