package controleur;

import java.awt.EventQueue;

import vue.MainView;

public class MainViewController {
	/**
	 * Main de l'application.
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

}
