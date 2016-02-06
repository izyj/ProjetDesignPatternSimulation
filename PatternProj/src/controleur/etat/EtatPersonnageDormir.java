package controleur.etat;

import controleur.moteurJeu.MoteurSimuDeplacement;
import modele.Guerrier;
import modele.Personnage;

public class EtatPersonnageDormir implements IEtatPersonnage {

	@Override
	public void actionDormir(AutomateEtat context) {
		MoteurSimuDeplacement moteur = (MoteurSimuDeplacement) context.getMoteur();
		for(Personnage perso : moteur.getListePersonnages()){
			if(perso instanceof Guerrier){
				Guerrier guerrier = (Guerrier) perso;
				
			}
		}
		
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
	public void actionPersoAttaqueCorpsACorps(AutomateEtat context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPersoAttaqueADistance(AutomateEtat context) {
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

	
}
