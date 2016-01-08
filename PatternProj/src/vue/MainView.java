package vue;

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;

import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.SystemColor;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;

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
		 * Item de la barre de configuration
		 */
		JMenu menuConfiguration = new JMenu("Configuration XML");
		menuBar.add(menuConfiguration);
		
			/**
			 * Bouton laby
			 */
			JMenuItem mntmFichierXMLLaby = new JMenuItem("Fichier XML - Labyrinthe");
			mntmFichierXMLLaby.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					 File repertoireCourant = null;
				        try {
				            repertoireCourant = new File(".").getCanonicalFile();
				            System.out.println("Répertoire courant : " + repertoireCourant);
				        } catch(IOException e) {}
				         
				        JFileChooser dialogue = new JFileChooser(repertoireCourant);
				        dialogue.showOpenDialog(null);
				        System.out.println("Fichier choisi : " + dialogue.getSelectedFile());
				}
			});
			menuConfiguration.add(mntmFichierXMLLaby);
			
			/**
			 * Bouton déplacement
			 */
			JMenuItem mntmFichierXMLDeplacement = new JMenuItem("Fichier XML - D\u00E9placement");
			mntmFichierXMLDeplacement.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					 File repertoireCourant = null;
				        try {
				            repertoireCourant = new File(".").getCanonicalFile();
				            System.out.println("Répertoire courant : " + repertoireCourant);
				        } catch(IOException e) {}
				         
				        JFileChooser dialogue = new JFileChooser(repertoireCourant);
				        dialogue.showOpenDialog(null);
				        System.out.println("Fichier choisi : " + dialogue.getSelectedFile());
				}
			});
			menuConfiguration.add(mntmFichierXMLDeplacement);
			
			/**
			 * Bouton Tower Defence
			 */
			JMenuItem mntmFichierXMLTowerDefence = new JMenuItem("Fichier XML - Tower Defence");
			mntmFichierXMLTowerDefence.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					 File repertoireCourant = null;
				        try {
				            repertoireCourant = new File(".").getCanonicalFile();
				            System.out.println("Répertoire courant : " + repertoireCourant);
				        } catch(IOException e) {}
				         
				        JFileChooser dialogue = new JFileChooser(repertoireCourant);
				        dialogue.showOpenDialog(null);
				        System.out.println("Fichier choisi : " + dialogue.getSelectedFile());
				}
			});
			menuConfiguration.add(mntmFichierXMLTowerDefence);
		
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
