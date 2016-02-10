package controleur.etat;

import java.util.ArrayList;
import java.util.List;

import modele.Guerrier;
import modele.Personnage;
import modele.Iinterface.IObservable;
import modele.Iinterface.IObservateur;

public class EtatPersonnageConflit implements IEtatPersonnage, IObservable {
	
	private List<IObservateur> listObservateur = null; 
	Personnage personnage1, personnage2;
	public EtatPersonnageConflit(Personnage perso1,Personnage perso2) {
		
		personnage1 = perso1;
		personnage2 = perso2;
		listObservateur = new ArrayList<>();
	}
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
		
		ajouterObservateur((IObservateur)context.getMoteur());
		while(!personnage1.isKo() && !personnage2.isKo()){
			if(!personnage1.isKo()){
			personnage1.combattre(personnage2);
			System.out.println("vie heros "+personnage1.getVie() + personnage1.isKo());
			}
			if(!personnage2.isKo()){
			personnage2.combattre(personnage1);
			System.out.println("vie monstre "+personnage2.getVie()+ personnage2.isKo());
			}
		}
		if(personnage1.isKo()){
			personnage1.getContexteEtat().etatP = new EtatPersonnageMort();
			System.out.println("Le heros est mort!");
		}else
		if(personnage2.isKo()){
			personnage2.getContexteEtat().etatP = new EtatPersonnageMort();
		}
		
		// Si le guerrier n'est pas mort a lors on le repasse en etat deplacement
		if(personnage1 instanceof Guerrier && !personnage1.isKo()){
			System.out.println("Le heros est vivant il reprend sa route!");
			personnage1.getContexteEtat().etatP = new EtatPersonnageDeplacement();
			notifierObservateurs();
			
			
		}else
		if(personnage2 instanceof Guerrier && !personnage2.isKo()){
			
			personnage2.getContexteEtat().etatP = new EtatPersonnageDeplacement();
			notifierObservateurs();
		}
		
	}


	@Override
	public void actionPersoImmobile(AutomateEtat context) {
		throw null;
		
	}

	@Override
	public void actionPersoEnDeplacement(AutomateEtat context) {
		throw null;
		
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
		for (IObservateur iObservateur : listObservateur) {
			iObservateur.actualiser(this);
		}
		
	}

	

	

}
