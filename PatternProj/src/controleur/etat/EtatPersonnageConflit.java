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
			
			personnage1.actionAttaquer(personnage2);
			personnage2.actionAttaquer(personnage1);
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
