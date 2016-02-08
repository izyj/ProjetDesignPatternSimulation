package modele;

import java.util.Random;

import modele.Comportement.Combat.ComportementAvecCouteau;
import modele.Iinterface.IPersonnage;
import modele.map.Zone;

public class Monstre extends Personnage implements IPersonnage {
	
	

	public Monstre() {
		
		this.ComportementCombat = new ComportementAvecCouteau(this);
		vie = 10;
		//ko = false;
		force =5;
	}
	@Override
	public int getVie() {

		return this.vie;
	}

	@Override
	public void setVie(int vie) {

		if (vie<0){
			this.vie = 0;
			
		}else
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
	public void seReposer(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int attaque() {
		
		Random rnd = new Random();
		int d= rnd.nextInt(force)+1 ;
		return d;
	}
	@Override
	public void actionAttaquer(Personnage ennemie) {
		ennemie.setVie(ennemie.getVie()- this.attaque());
		this.toString();
		
	}
	@Override
	public String toString() {
		System.out.println(" Monstre est toujour en vie \nVie  = "+vie+"\nForce = "+force);
		return " Monstre est toujour en vie \nVie  = "+vie+"\nForce = "+force;
	}

}
