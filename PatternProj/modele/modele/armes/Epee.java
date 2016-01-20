package modele.armes;

import modele.Arme;

/**
 *
 * @author Gaetan
 *
 */
public class Epee implements Arme{

	String nom;
	int portee;
	String type;
	int bonus;
	int dureeVie;
	int degat;

	public Epee(){
		super();

	}

	public String getNom() {
		nom = "Ep�e Coupe Tout";
		return nom;
	}

	public int getDegatsDeBase() {
		degat = 6 + (int)(Math.random() * ((10 - 1) + 1));
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
	 * Fourni la port�e de l'�p�e
	 * @return portee
	 */
	public int getPortee(){
		portee = 1;
		return portee;
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
