package utils;

import java.io.File;
import java.util.Iterator;
import java.util.List;

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

		File test = new File("C:\\Users\\Gaetan\\Desktop\\partie1.xml");

		// On crée une instance de SAXBuilder
		SAXBuilder sxb = new SAXBuilder();
		Document document = null;

		try {
			// On crée un nouveau document JDOM avec en argument le fichier XML
			// Le parsing est terminé ;)
			document = sxb.build(test);
		} catch (Exception e) {
		}

		// On initialise un nouvel élément racine avec l'élément racine du
		// document.
		racine = document.getRootElement();

		// Méthode définie dans la partie 3.2. de cet article
		afficheCarte();

		// return null;
	}

	/**
	 * Récupère la carte dans le fichier XML.
	 */
	static void afficheCarte() {

		// On crée une List contenant tous les noeuds "carte" de l'Element
		// racine
		List listParties= racine.getChildren("carte");

		// On crée un Iterator sur notre liste
		Iterator i = listParties.iterator();

		while (i.hasNext()) {
			// On recrée l'Element courant à chaque tour de boucle afin de
			// pouvoir utiliser les méthodes propres aux Element comme :
			// sélectionner un nœud fils, modifier du texte, etc...
			Element courant = (Element) i.next();
			// On affiche le nom de l’élément courant
			System.out.println(courant.getChild("carte").getText());
		}
	}

}
