package modele.armes;

import modele.Arme;

/**
 * 
 * @author Gaetan
 *
 */
public class Fusils implements Arme{

	String nom;
	int portee;
	String type;
	int bonus;
	int dureeVie;
	int degat;
	
	public Fusils(){
		super();
	}
	
	public String getNom() {
		nom = "FusilsMwaaa";
		return nom;
	}

	public int getDegatsDeBase() {
		degat = 3 + (int)(Math.random() * ((6 - 1) + 1));
		return degat;
	}

	/**
	 * Fourni le type de l'arme
	 * @return type
	 */
	public String getType() {
		type = "Arme à distance";
		return type;
	}
	
	/**
	 * Fourni la portée du fusils
	 * @return portee
	 */
	public int getPortee(){
		portee = 6;
		return portee;
	}
	
	/**
	 * Dégats bonus si attaque au max de sa portée de tir
	 * @return bonus
	 */
	public int degatsBonusAttaqueMaxPortee(){
		bonus = 2;
		return bonus;
	}
	
	/**
	 * Durée de vie de l'arme
	 * @return dureeVie
	 */
	public int getDureeDeVie(){
		dureeVie = 7;
		return dureeVie;
	}
	
}
