package modele.Comportement.Combat;

import modele.Personnage;
import modele.armes.Dague;

public class ComportementAvecCouteau  implements IComportementCombat {
	
	Personnage currentPersonnage;
	
	public ComportementAvecCouteau(Personnage personnageAuCouteau) {
		
		currentPersonnage = personnageAuCouteau;
	}
	
	@Override
	public void Attaquer(Personnage perso) {
		Dague d = new Dague();
		
		currentPersonnage.setAttaque(currentPersonnage.getForce() + d.getDegatsDeBase());
		currentPersonnage.actionAttaquer(perso);
		
		
	}

}
