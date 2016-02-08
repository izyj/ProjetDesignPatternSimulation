package controleur.etat;

public class EtatPersonnageDormir implements IEtatPersonnage {

	@Override
	public void actionDormir(AutomateEtat context) {
		// TODO Auto-generated method stub
	public void actionDormir(AutomateEtat context) {
		MoteurSimuDeplacement moteur = (MoteurSimuDeplacement) context.getMoteur();
		for(Personnage perso : moteur.getListePersonnages()){
			if(perso instanceof Guerrier){
				Guerrier guerrier = (Guerrier) perso;
				try {
					moteur.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
