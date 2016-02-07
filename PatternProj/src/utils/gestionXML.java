package utils;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import modele.Arme;
import modele.Personnage;
import modele.Keys.EnumElementPlateau;
import modele.armes.Arc;
import modele.armes.Dague;
import modele.armes.Epee;
import modele.armes.Fusils;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

/**
 * 
 * @author Gaetan
 *
 */
public class gestionXML {

	static Element racine;

	// public static String lectureFichierXML(File url){
	public static void main(String[] args) {

		// Url de test à virer quand implémenté dans les differents boutons.
		File test = new File("C:\\Users\\Gaetan\\Desktop\\partie1.xml");

		// On crée une instance de SAXBuilder.
		SAXBuilder sxb = new SAXBuilder();
		Document document = null;

		try {
			// On crée un nouveau document JDOM avec en argument le fichier XML.
			document = sxb.build(test);
		} catch (Exception e) {
		}

		// On initialise un nouvel élément racine avec l'élément racine du document.
		racine = document.getRootElement();

		getCarte();
		getPersonnage();
		getArme();
		// return null;
	}

	/**
	 * Récupère la carte dans le fichier XML.
	 * 
	 * @return carte
	 */
	static String getCarte() {

		String carte = "";

		// On crée une List contenant tous les noeuds "carte" de l'Element racine.
		List<Element> listParties = racine.getChildren("carte");

		// On crée un Iterator sur notre liste
		Iterator<Element> i = listParties.iterator();

		while (i.hasNext()) {
			Element courant = (Element) i.next();
			carte = courant.getText();
			System.out.println(carte);
		}
		return carte;
	}
	
	/**
	 * Récupère les infos du personnage du fichier XML.
	 * @return personnage
	 */
	static Personnage getPersonnage() {

		Personnage personnage = new Personnage() {
			public void seReposer(int i) {}
			public int attaque() {return 0;}
			public void KO() {}
		};
		
		// On crée une List contenant tous les noeuds "carte" de l'Element racine.
		List<Element> listParties = racine.getChildren("personnage");

		// On crée un Iterator sur notre liste
		Iterator<Element> i = listParties.iterator();

		while (i.hasNext()) {
			Element courant = (Element) i.next();
			personnage.setName(courant.getChildText("nom"));
			personnage.setVie(Integer.parseInt(courant.getChildText("vie")));
			personnage.setForce(Integer.parseInt(courant.getChildText("force")));
			personnage.setAttaque(Integer.parseInt(courant.getChildText("attaque")));
		}
		return personnage;
	}
	
	/**
	 * Retourne l'arme de base du personnage du fichier XML
	 * @return
	 */
	static Arme getArme() {

		// On crée une List contenant tous les noeuds "carte" de l'Element racine.
		List<Element> listParties = racine.getChildren("armes");

		// On crée un Iterator sur notre liste
		Iterator<Element> i = listParties.iterator();

		while (i.hasNext()) {
			Element courant = (Element) i.next();

			switch (courant.getChildText("nom")) {
		        case "Epee":  	Epee uneEpee = new Epee();
		        				return uneEpee;
				case "Dague":  	Dague uneDague = new Dague();
								return uneDague;
		        case "Fusils":  Fusils unFusil = new Fusils();
		        			    return unFusil;
		        case "Arc": 	Arc unArc = new Arc();
		        				return unArc;
			}
		}
		return null;
	}
}
