package vue.utils;

import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;

public class gestionImages {
	
	/**
	 * Retour l'image du personnage
	 * @return image
	 */
	public static Image getPersonnage() {
		final File f = new File("");
		String fichier = "ressources\\images\\personnage.png";
		final String fichierPath = f.getAbsolutePath() + File.separator + fichier;
		java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage(fichierPath);
		return image;
	}
	
	/**
	 * Retourne l'image d'un mur
	 * @return image
	 */
	public static Image getMur() {
		final File f = new File("");
		String fichier = "ressources\\images\\mur.png";
		final String fichierPath = f.getAbsolutePath() + File.separator + fichier;
		java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage(fichierPath);
		return image;
	}
	
	/**
	 * Retourne l'image de la zone d'arrivée
	 * @return image
	 */
	public static Image getFin() {
		final File f = new File("");
		String fichier = "ressources\\images\\fin.png";
		final String fichierPath = f.getAbsolutePath() + File.separator + fichier;
		java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage(fichierPath);
		return image;
	}
	
	/**
	 * Retourne l'image de la nouriture
	 * @return image
	 */
	public static Image getNourriture() {
		final File f = new File("");
		String fichier = "ressources\\images\\food.png";
		final String fichierPath = f.getAbsolutePath() + File.separator + fichier;
		java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage(fichierPath);
		return image;
	}
	
	/**
	 * Retourne l'image des monstres
	 * @return image
	 */
	public static Image getMonstre() {
		final File f = new File("");
		String fichier = "ressources\\images\\monstre.png";
		final String fichierPath = f.getAbsolutePath() + File.separator + fichier;
		java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage(fichierPath);
		return image;
	}
	
	/**
	 * Retourne l'image des armes
	 * @return image
	 */
	public static Image getArme() {
		final File f = new File("");
		String fichier = "ressources\\images\\arme.png";
		final String fichierPath = f.getAbsolutePath() + File.separator + fichier;
		java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage(fichierPath);
		return image;
	}
	
	/**
	 * Retourne l'image des tours
	 * @return image
	 */
	public static Image getTour() {
		final File f = new File("");
		String fichier = "ressources\\images\\guardTower.png";
		final String fichierPath = f.getAbsolutePath() + File.separator + fichier;
		java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage(fichierPath);
		return image;
	}
	
	/**
	 * Retourne l'image du sol
	 * @return image
	 */
	public static Image getSol() {
		final File f = new File("");
		String fichier = "ressources\\images\\sol.png";
		final String fichierPath = f.getAbsolutePath() + File.separator + fichier;
		java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage(fichierPath);
		return image;
	}
	
}
