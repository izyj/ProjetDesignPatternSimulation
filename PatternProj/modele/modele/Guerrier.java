package modele;

import java.util.Random;

import modele.Iinterface.IPersonnage;
import modele.map.Zone;


public class Guerrier extends Personnage implements IPersonnage {

	public Guerrier() {
		vie = 5;
		ko = false;
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
	public int getAttaque() {

		return this.attaque;
	}

	@Override
	public void setAttaque(int force) {
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
		
		if (i == 2){ // il s'arrete 2 secondes. Il récupérera  2 points de vie.
			vie +=2;
			if (vie == 10){
				vie =10;	
			}
		}
		if (i == 1){ // il s'arrete 1 secondes. Il commence par 5 points de vie.
			vie +=5;
			if (vie == 10){
				vie =10;	
			}
		}
		
		if (i == 5){ // il s'arrete 5 secondes. Il récupérera par 4 points de vie.
			vie +=4;
			if (vie == 10){
				vie =10;	
			}
		}		
	}

	@Override
	public void KO() {
		if (ko == true){ //Quand il perd de la vie il doit s'arrêter pendant 1 seconde.
			seReposer(1);
			
			}
		
	}

	@Override
	public int attaque() {
		Random rnd = new Random();
		int d= rnd.nextInt(force)+1 ;
		return d;
	}
}
