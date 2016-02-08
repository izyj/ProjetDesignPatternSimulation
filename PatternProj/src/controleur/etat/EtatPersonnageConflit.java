package controleur.etat;

import modele.Personnage;

public class EtatPersonnageConflit implements IEtatPersonnage {
	
	private Personnage attaquant, victime;
	
	public EtatPersonnageConflit() {
		
	}
	
	public EtatPersonnageConflit(Personnage attaquant, Personnage victime) {
		
		this.attaquant = attaquant;
		this.victime = victime;
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
	public void actionPersoAttaqueCorpsACorps(AutomateEtat context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPersoAttaqueADistance(AutomateEtat context) {
		
		attaquant.combattre(victime);
		if(victime.isKo()){
			
		}
		
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
