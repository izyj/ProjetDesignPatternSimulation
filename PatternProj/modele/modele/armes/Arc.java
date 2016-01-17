package modele.armes;

import modele.Arme;

/**
 * 
 * @author Gaetan
 *
 */
public class Arc implements Arme{

	String nom;
	int portee;
	String type;
	int bonus;
	
	public Arc(){
		super();
	}
	
	public String getNom() {
		nom = "Arc En Ciel";
		return nom;
	}

	public int getDegatsDeBase() {
		return 2;
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

}
