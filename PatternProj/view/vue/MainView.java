package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;



public class MainView {

	public JFrame frmPatternogame;

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
		frmPatternogame.setBounds(100, 100, 1008, 633);
		frmPatternogame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/**
		 * Barre de menu
		 */
		JMenuBar menuBar = new JMenuBar();
		frmPatternogame.setJMenuBar(menuBar);

		/**
		 * Item File de la barre de menu
		 */
		JMenu menuMenu = new JMenu("Menu");
		menuBar.add(menuMenu);

			/**
			 * Bouton pour nouveau jeu
			 */
			JMenuItem mntmNouveauJeu = new JMenuItem("Nouveau jeu");
			mntmNouveauJeu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

				}
			});
			menuMenu.add(mntmNouveauJeu);

			/**
			 * Bouton pour sauvegarder la partie
			 */
			JMenuItem mntmSauvgarder = new JMenuItem("Sauvegarder");
			mntmSauvgarder.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

				}
			});
			menuMenu.add(mntmSauvgarder);

			/**
			 * Bouton pour fermer l'application
			 */
			JMenuItem mntmFermer = new JMenuItem("Fermer");
			mntmFermer.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

				}
			});
			menuMenu.add(mntmFermer);

		/**
		 * Pannel de la bannière
		 */
		JPanel panel_banniere = new JPanel();
		panel_banniere.setBackground(Color.DARK_GRAY);
		frmPatternogame.getContentPane().add(panel_banniere, BorderLayout.NORTH);

		JLabel lblPatternogame = new JLabel("Pattern'O'Game");
		lblPatternogame.setForeground(SystemColor.window);
		lblPatternogame.setFont(new Font("Vijaya", Font.BOLD, 40));
		panel_banniere.add(lblPatternogame);

		/**
		 * Pannel du menu
		 */
		JPanel panel_menu = new JPanel();
		panel_menu.setBackground(Color.DARK_GRAY);
		frmPatternogame.getContentPane().add(panel_menu, BorderLayout.CENTER);

		/**
		 * Simulation Labyrinthe
		 */
		JButton btnLabyrinthe = new JButton("");
		btnLabyrinthe.addActionListener(null);
		btnLabyrinthe.setBackground(Color.DARK_GRAY);
		btnLabyrinthe.setIcon(new ImageIcon(MainView.class.getResource("/images/laby.png")));
		btnLabyrinthe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser dialogue = new JFileChooser();
	            dialogue.showOpenDialog(null);

	            System.out.println("Fichier choisi : " + dialogue.getSelectedFile());
			}
		});
		panel_menu.add(btnLabyrinthe);

		/**
		 * Simulation Deplacement
		 */
		JButton btnDeplacement = new JButton("");
		btnDeplacement.setBackground(Color.DARK_GRAY);
		btnDeplacement.setIcon(new ImageIcon(MainView.class.getResource("/images/deplacement.png")));
		btnDeplacement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PlateauSimuDeplacement dep = new PlateauSimuDeplacement();
				dep.createPlateau();
			}
		});
		GridBagConstraints gbc_btnDeplacement = new GridBagConstraints();
		panel_menu.add(btnDeplacement, gbc_btnDeplacement);

		/**
		 * Simulation Tower Defence
		 */
		JButton btnTowerDefence = new JButton("");
		btnTowerDefence.setBackground(Color.DARK_GRAY);
		btnTowerDefence.setIcon(new ImageIcon(MainView.class.getResource("/images/tower.png")));
		btnTowerDefence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {


			}
		});
		panel_menu.add(btnTowerDefence);
	}

}
