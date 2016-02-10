package controleur.etat;



import controleur.moteurJeu.MoteurSimuDeplacement;
import modele.Guerrier;
import modele.Personnage;
import modele.Iinterface.IObservable;
import modele.Iinterface.IObservateur;

public class EtatPersonnageDormir implements IEtatPersonnage, IObservable {

	@Override
	public void actionDormir(AutomateEtat context) {
	
		MoteurSimuDeplacement moteur = (MoteurSimuDeplacement) context.getMoteur();
		for (Personnage perso : moteur.getListePersonnages()) {
			if (perso instanceof Guerrier) {
				perso.seReposer();
				
			}
		}
		try {
			moteur.sleep(4000);
			context.etatP = new EtatPersonnageDeplacement();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionSeReveiller(AutomateEtat context) {
		
		
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
