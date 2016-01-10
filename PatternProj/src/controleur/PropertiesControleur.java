package controleur;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesControleur {

	   
	/**
	 * Récuperation des données du fichier properties.
	 * @return properties
	 */
	public static Properties getProperties(String path){
		
		// Intervertir les lignes de commentaires pour test sur eclipse
//		String configPath="src/properties/PatternOGame.properties";
		String configPath="PatternOGame.properties";
		
		Properties properties = new Properties();
		try {
			FileInputStream in = new FileInputStream(configPath);
			properties.load(in);
			in.close();
		} catch (IOException e) {
			GestionExeptions.ecritureExeption("erreur_chargement_fichier_properties");
		}
		
		return properties;
	}
	
}
