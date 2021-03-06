package modele.armes;

import modele.Arme;

/**
 * 
 * @author Gaetan
 *
 */
public class Dague implements Arme{

	String nom;
	int portee;
	String type;
	int bonus;
	int dureeVie;
	int degat;
	
	public Dague(){
		super();
	}
	
	public String getNom() {
		nom = "Faucheuse d'�me";
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
		type = "Arme au CaC";
		return type;
	}
	
	/**
	 * Fourni la port�e de la dague
	 * @return portee
	 */
	public int getPortee(){
		portee = 1;
		return portee;
	}
	
	/**
	 * Gagne 1Pdv par coups de dague
	 * @return bonus
	 */
	public int getBonusVolDeVie(){
		bonus = 1;
		return bonus;
	}
	
	/**
	 * Dur�e de vie de l'arme
	 * @return dureeVie
	 */
	public int getDureeDeVie(){
		dureeVie = 5;
		return dureeVie;
	}
}
