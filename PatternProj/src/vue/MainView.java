package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

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
		
		/**
		 * Barre de menu
		 */
		JMenuBar menuBar = new JMenuBar();
		frmPatternogame.setJMenuBar(menuBar);
		
		/**
		 * Item File de la barre de menu
		 */
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
		 * Pannel de la banni�re
		 */
		JPanel panel_banniere = new JPanel();
		panel_banniere.setBackground(Color.PINK);
		frmPatternogame.getContentPane().add(panel_banniere, BorderLayout.NORTH);
		
		JLabel lblPatternogame = new JLabel("Pattern'O'Game");
		lblPatternogame.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_banniere.add(lblPatternogame);
		
		/**
		 * Pannel du menu
		 */
		JPanel panel_menu = new JPanel();
		panel_menu.setBackground(Color.ORANGE);
		frmPatternogame.getContentPane().add(panel_menu, BorderLayout.CENTER);
		GridBagLayout gbl_panel_menu = new GridBagLayout();
		gbl_panel_menu.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_menu.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_menu.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_menu.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_menu.setLayout(gbl_panel_menu);
		
		/**
		 * Simulation Labyrinthe
		 */
		JButton btnLabyrinthe = new JButton("Labyrinthe");
		btnLabyrinthe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		GridBagConstraints gbc_btnLabyrinthe = new GridBagConstraints();
		gbc_btnLabyrinthe.insets = new Insets(0, 0, 0, 5);
		gbc_btnLabyrinthe.gridx = 5;
		gbc_btnLabyrinthe.gridy = 7;
		panel_menu.add(btnLabyrinthe, gbc_btnLabyrinthe);
		
		/**
		 * Simulation Deplacement
		 */
		JButton btnDeplacement = new JButton("D\u00E9placement");
		btnDeplacement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		GridBagConstraints gbc_btnDeplacement = new GridBagConstraints();
		gbc_btnDeplacement.insets = new Insets(0, 0, 0, 5);
		gbc_btnDeplacement.gridx = 10;
		gbc_btnDeplacement.gridy = 7;
		panel_menu.add(btnDeplacement, gbc_btnDeplacement);
		
		/**
		 * Simulation Tower Defence
		 */
		JButton btnTowerDefence = new JButton("Tower Defence");
		btnTowerDefence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		GridBagConstraints gbc_btnTowerDefence = new GridBagConstraints();
		gbc_btnTowerDefence.gridx = 15;
		gbc_btnTowerDefence.gridy = 7;
		panel_menu.add(btnTowerDefence, gbc_btnTowerDefence);
	}

}
