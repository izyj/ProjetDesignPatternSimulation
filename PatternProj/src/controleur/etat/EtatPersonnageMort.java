package controleur.etat;

import controleur.moteurJeu.MoteurSimuDeplacement;

public class EtatPersonnageMort implements IEtatPersonnage {

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
		/**MoteurSimuDeplacement moteur = (MoteurSimuDeplacement) context.getMoteur();
		IndexProcessor runnable = null;
		Thread thread = new Thread(moteur);
		 if (thread != null) {
	            runnable.terminate();
	            thread.join();
	            LOGGER.debug("Thread successfully stopped.");
	        }*/
		
		System.out.println("mooooooooort");
		
	}

	@Override
	public void actionPersoAttaque(AutomateEtat context) {
		//context.moteur.getClass().
		
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