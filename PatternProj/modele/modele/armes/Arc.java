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
		type = "Arme � distance";
		return type;
	}

	/**
	 * Fourni la port�e de l'arc
	 * @return portee
	 */
	public int getPortee(){
		portee = 3;
		return portee;
	}

	/**
	 * D�gats bonus si attaque au max de sa port�e de tir
	 * @return bonus
	 */
	public int degatsBonusAttaqueMaxPortee(){
		bonus = 2;
		return bonus;
	}

	/**
	 * Dur�e de vie de l'arme
	 * @return dureeVie
	 */
	public int getDureeDeVie(){
		dureeVie = 7;
		return dureeVie;
	}

}
