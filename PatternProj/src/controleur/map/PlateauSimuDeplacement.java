package controleur.map;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import controleur.factory.SimuDeplacementFactory;
import modele.Guerrier;
import modele.Personnage;
import modele.Iinterface.IObservable;
import modele.Iinterface.IObservateur;
import modele.Iinterface.IPlateau;
import modele.Keys.EnumTypePersonnage;
import modele.map.Grille;

public class PlateauSimuDeplacement extends IPlateau implements IObservateur {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private static int LONGUEURPLATEFORME = 30;
	private static int LARGEURPLATEFORME = 30;
	private Grille  grille;
	private SimuDeplacementFactory factory;

	public PlateauSimuDeplacement() {

	}

	@Override
	public void createPlateau() {
		grille = new Grille();
		factory = new SimuDeplacementFactory();
		List<Personnage> personnages = new ArrayList<>();
		personnages.add( new Guerrier());
		grille.chargerPersonnage(personnages);
		this.getContentPane().add(grille);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setBackground(new Color(173,161,118));
		this.setSize(700, 700);
		setVisible(true);
	}

	@Override
	public void actualiser(IObservable o) {

	}

	@Override
	public void deplacerPersonnage() {
		// TODO Auto-generated method stub

	}
}
