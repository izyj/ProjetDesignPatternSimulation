package modele.armes;

import modele.Arme;

/**
 *
 * @author Gaetan
 *
 */
public class Arc implements Arme{

	private String nom;
	private int portee;
	private String type;
	private int bonus;
	private int dureeVie;
	private int degat;

	public Arc(){
		super();
	}

	public String getNom() {
		nom = "Arc En Ciel";
		return nom;
	}

	public int getDegatsDeBase() {
		degat = 1 + (int)(Math.random() * ((3 - 1) + 1));
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
	 * Fourni la portée de l'arc
	 * @return portee
	 */
	public int getPortee(){
		portee = 3;
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
