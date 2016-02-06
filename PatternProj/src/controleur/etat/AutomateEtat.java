package controleur.etat;

import modele.Iinterface.IMoteurDeJeu;

public class AutomateEtat implements IActionPersonnage {
	
	IMoteurDeJeu moteur;
	IEtatPersonnage etatP;
	

	public AutomateEtat(IMoteurDeJeu moteurDeJeu) {
		moteur = moteurDeJeu;
		etatP = new EtatPersonnageArreter();
	}
	
	
	public void changerEtat(IEtatPersonnage etat){
		etatP = etat;
	}
	
	public void action(){
		
		if(etatP instanceof EtatPersonnageDeplacement){
			actionPersoSeDeplace();
		}
		if(etatP instanceof EtatPersonnageDormir){
			etatP.actionDormir(this);
		}
		if(etatP instanceof EtatPersonnageArreter){
			
		}
		if(etatP instanceof EtatPersonnageManger){
			etatP.actionManger(this);
		}
		if (etatP instanceof EtatPersonnageArreter) {
			
		}
		
	}
	
	public IMoteurDeJeu getMoteur() {
		return moteur;
	}
	
	public IEtatPersonnage getEtatP() {
		return etatP;
	}


	@Override
	public void actionDormir() {
		etatP.actionDormir(this);
		
	}


	@Override
	public void actionSeReveiller() {
		etatP.actionSeReveiller(this);
		
	}


	@Override
	public void actionManger() {
		etatP.actionManger(this);
		
	}


	@Override
	public void actionPersoAttaqueCorpsACorps() {
		etatP.actionPersoAttaqueCorpsACorps(this);
		
	}


	@Override
	public void actionPersoAttaqueADistance() {
		etatP.actionPersoAttaqueADistance(this);
		
	}


	@Override
	public void actionPersoSeDeplace() {
		etatP.actionPersoEnDeplacement(this);
		
	}
	
	
	
	
}
