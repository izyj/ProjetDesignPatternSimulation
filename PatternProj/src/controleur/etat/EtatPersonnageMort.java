package controleur.etat;



import java.awt.Container;

import controleur.moteurJeu.MoteurSimuDeplacement;
import modele.Iinterface.IObservable;
import modele.Iinterface.IObservateur;

public class EtatPersonnageMort implements IEtatPersonnage,IObservable {

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

		MoteurSimuDeplacement moteur = (MoteurSimuDeplacement) context.getMoteur();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		moteur.interrupt();
		
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