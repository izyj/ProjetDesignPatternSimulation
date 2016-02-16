package vue;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import controleur.contexte.ContexteSimulation;
import controleur.factory.SimuDeplacementFactory;
import controleur.moteurJeu.MoteurSimuDeplacement;
import modele.Guerrier;
import modele.Monstre;
import modele.Personnage;
import modele.Iinterface.IObservable;
import modele.Iinterface.IObservateur;
import modele.Iinterface.IPlateau;
import modele.map.Grille;

public class PlateauTowerDefense  extends IPlateau implements IObservateur{

	private static final long serialVersionUID = 1L;
	private static int LONGUEURPLATEFORME = 30;
	private static int LARGEURPLATEFORME = 30;
	private Grille  grille;
	private SimuDeplacementFactory factory;
	private ContexteSimulation contexte;


	public PlateauTowerDefense() {

	}

	@Override
	public void createPlateau() {
		grille = new Grille("ressources\\xml\\partie1.xml");
		factory = new SimuDeplacementFactory();
		contexte = new ContexteSimulation();
		List<Personnage> personnages = new ArrayList<>();
		contexte.setGrille(grille);
		personnages.add(new Guerrier());
		personnages.add(new Monstre());
		grille.chargerPersonnage(personnages);
		contexte.setListPersonnage(personnages);
		MoteurSimuDeplacement moteurJeu = new MoteurSimuDeplacement(contexte);
		moteurJeu.ajouterObservateur(this);
		moteurJeu.start();
		this.getContentPane().add(grille);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setBackground(new Color(173,161,118));
		this.setSize(700, 700);
		setVisible(true);
	}

	@Override
	public void deplacerPersonnage() {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualiser(IObservable o) {
		// TODO Auto-generated method stub
		
	}

}
