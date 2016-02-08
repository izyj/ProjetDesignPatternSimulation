package controleur.etat;

public class EtatPersonnageManger implements IEtatPersonnage {

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

}