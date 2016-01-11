package controleur;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;

public class GestionExeptions {
	
	/**
	 * Ecriture des erreurs dans un fichier de log
	 * @param exeption
	 */
	public static void ecritureExeption(String exeption) {
		
		final String chemin = "log.txt";
		
		final File fichier = new File(chemin);
		
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH:mm:ss");
		String texte_date = sdf.format(new Date());
		
		try {
			// Creation du fichier
			fichier.createNewFile();
			// Creation d'un writer
			final FileWriter writer = new FileWriter(fichier, true);
			try {
				switch (exeption){
					case "erreur_chargement_fichier_properties" : writer.write( "\n" + texte_date + " : Impossible de charger le fichier de configs "); break;
				}
			} finally {
				// Fermeture du fichier
				writer.close();
			}
		} catch (Exception e) {
			System.out.println("Impossible de creer le fichier");
		}
	}
}
