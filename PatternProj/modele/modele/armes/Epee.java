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
	
	public Epee(){
		super();
	}
	
	public String getNom() {
		nom = "Epée Coupe Tout";
		return nom;
	}

	public int getDegatsDeBase() {
		return 6;
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
	 * Fourni la portée de l'épée
	 * @return portee
	 */
	public int getPortee(){
		portee = 1;
		return portee;
	}
}
