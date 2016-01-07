package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class MainView {

	private JFrame frmPatternogame;

	/**
	 * Main de test pour la vue.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView window = new MainView();
					window.frmPatternogame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialisation de la vue
	 */
	public MainView() {
		initialize();
	}

	/**
	 * Initialisation du contenu de la frame
	 */
	private void initialize() {
		frmPatternogame = new JFrame();
		frmPatternogame.setTitle("Pattern'O'Game");
		frmPatternogame.setBounds(100, 100, 800, 600);
		frmPatternogame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmPatternogame.setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuBar.add(menuFile);
		
		/**
		 * Bouton pour nouveau jeu
		 */
		JMenuItem mntmNouveauJeu = new JMenuItem("Nouveau jeu");
		menuFile.add(mntmNouveauJeu);
		
		/**
		 * Bouton pour sauvegarder la partie
		 */
		JMenuItem mntmSauvgarder = new JMenuItem("Sauvegarder");
		menuFile.add(mntmSauvgarder);
		
		/**
		 * Bouton pour fermer l'application
		 */
		JMenuItem mntmFermer = new JMenuItem("Fermer");
		menuFile.add(mntmFermer);
		
		/**
		 * Pannel de la bannière
		 */
		JPanel panel_banniere = new JPanel();
		frmPatternogame.getContentPane().add(panel_banniere, BorderLayout.NORTH);
		
		/**
		 * Pannel du menu
		 */
		JPanel panel_menu = new JPanel();
		frmPatternogame.getContentPane().add(panel_menu, BorderLayout.CENTER);
	}

}
