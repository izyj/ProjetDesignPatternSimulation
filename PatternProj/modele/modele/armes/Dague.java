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
	
	public Dague(){
		super();
	}
	
	public String getNom() {
		nom = "Faucheuse d'âme";
		return nom;
	}

	public int getDegatsDeBase() {
		return 4;
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
	 * Fourni la portée de la dague
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
}
