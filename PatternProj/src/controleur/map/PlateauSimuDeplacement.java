package controleur.map;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

import modele.map.Grille;
import modele.map.IPlateau;

public class PlateauSimuDeplacement extends IPlateau {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private static int LONGUEURPLATEFORME = 30;
	private static int LARGEURPLATEFORME = 30;
	private Grille  grille;

	public PlateauSimuDeplacement() {

	}

	@Override
	public void createPlateau() {
		grille = new Grille();

		this.getContentPane().add(grille);


		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 700);
		setVisible(true);




	}



}
