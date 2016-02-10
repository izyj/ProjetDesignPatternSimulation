package modele;

import java.util.Random;

import controleur.etat.AutomateEtat;
import controleur.etat.EtatPersonnageDeplacement;
import modele.Iinterface.IPersonnage;
import modele.map.Zone;


public class Guerrier extends Personnage implements IPersonnage {

	public Guerrier() {
		vie = 15;
		//ko = false;
		force =5;
	}

	@Override
	public int getVie() {

		return this.vie;
	}

	@Override
	public void setVie(int vie) {

		this.vie = vie;
		if (vie<0){

			vie=0;
		}

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
		
		vie +=2;		
	}


	@Override
	public int attaque() {
		Random rnd = new Random();
		int d= rnd.nextInt(force)+1 ;
		return d;
	}
}
