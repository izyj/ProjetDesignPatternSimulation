package modele;

import modele.Iinterface.IPersonnage;
import modele.map.Zone;

public class Voiture extends Personnage implements IPersonnage{

	public Voiture() {

	}

	@Override
	public int getVie() {

		return this.vie;
	}

	@Override
	public void setVie(int vie) {

		this.vie = vie;

	}

	@Override
	public int getForce() {

		return this.attaque;
	}

	@Override
	public void setForce(int force) {
		this.attaque = force;

	}

	@Override
	public String getEtat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEtat(String etat) {
		// TODO Auto-generated method stub

	}

	@Override
	public Zone getPosition() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void analyseSituation() {
		// TODO Auto-generated method stub

	}

	@Override
	public void execution() {
		// TODO Auto-generated method stub

	}

	@Override
	public void miseAJour() {
		// TODO Auto-generated method stub

	}

	@Override
	public void seReposer() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int attaque() {
		// TODO Auto-generated method stub
		return 0;
	}
}
