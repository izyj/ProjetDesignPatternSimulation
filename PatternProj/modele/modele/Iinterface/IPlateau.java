package modele.Iinterface;

import javax.swing.JFrame;

import modele.map.Grille;

public abstract class IPlateau extends JFrame {

	/**
	 * Methode qui va mettre en place le plateau de simulation
	 */
	public abstract void createPlateau();


	/**
	 * Methode permettant de deplacer un personnage
	 */
	public abstract void deplacerPersonnage();

	/**
	 * Methode qui va liée les cases entre elles
	 * @param grille
	 */
	public void liaisonCases(Grille grille){




	}

}
