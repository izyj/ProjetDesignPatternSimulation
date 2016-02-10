package modele.Comportement.Combat;

import modele.Personnage;

public class ComportementDeMonstre implements IComportementCombat {

	Personnage currentPersonnage;
	
	public ComportementDeMonstre(Personnage personnageAuCouteau) {
		
		currentPersonnage = personnageAuCouteau;
	}
	@Override
	public void Attaquer(Personnage perso) {
		
		currentPersonnage.actionAttaquer(perso);
		
	}

}
