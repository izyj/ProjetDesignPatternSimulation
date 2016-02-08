package controleur.etat;

import modele.Personnage;

public class EtatPersonnageConflit implements IEtatPersonnage {

	Personnage personnage1, personnage2;
	public EtatPersonnageConflit(Personnage perso1,Personnage perso2) {
		personnage1 = perso1;
		personnage2 = perso2;
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
		
		while(!personnage1.isKo() && !personnage2.isKo()){
			
			personnage1.combattre(personnage2);
			personnage2.combattre(personnage1);
		}
		if(personnage1.isKo()){
			personnage1.getContexteEtat().etatP = new EtatPersonnageMort();
		}else
		if(personnage2.isKo()){
			personnage2.getContexteEtat().etatP = new EtatPersonnageMort();
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

	

	

}
