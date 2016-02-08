package controleur.etat;

import controleur.moteurJeu.MoteurSimuDeplacement;
import modele.Guerrier;
import modele.Personnage;

public class EtatPersonnageDeplacement implements IEtatPersonnage {

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
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPersoImmobile(AutomateEtat context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPersoEnDeplacement(AutomateEtat context) {
		
		
		if(context.getMoteur() instanceof MoteurSimuDeplacement){
			Guerrier hero = null;
			// Je recupère la position du personnage et je l'incrémente afin qui se déplace dans les cases.
				MoteurSimuDeplacement moteur = (MoteurSimuDeplacement) context.getMoteur();
				for (Personnage personnage : moteur.getListePersonnages()) {

					if (personnage instanceof Guerrier) {
						hero = (Guerrier) personnage;
					}

				}
				//System.out.println(hero.getPositionX());
				
				//System.out.println(moteur.getNewPositionY());
				moteur.setNewPositionY(hero.getPositionY()) ;
				moteur.setNewPositionX(hero.getPositionX() +1);
				System.out.println(moteur.getNewPositionX());
				if(moteur.getNewPositionX() == 10 ){
					moteur.setNewPositionY(moteur.getNewPositionY()+1);
					 moteur.setNewPositionX(0);
				}
				
		}
		
	}


	
	

}
