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

		// On cr�e une instance de SAXBuilder
		SAXBuilder sxb = new SAXBuilder();
		Document document = null;

		try {
			// On cr�e un nouveau document JDOM avec en argument le fichier XML
			// Le parsing est termin� ;)
			document = sxb.build(test);
		} catch (Exception e) {
		}

		// On initialise un nouvel �l�ment racine avec l'�l�ment racine du
		// document.
		racine = document.getRootElement();

		// M�thode d�finie dans la partie 3.2. de cet article
		afficheCarte();

		// return null;
	}

	/**
	 * R�cup�re la carte dans le fichier XML.
	 */
	static void afficheCarte() {

		// On cr�e une List contenant tous les noeuds "carte" de l'Element
		// racine
		List listParties= racine.getChildren("carte");

		// On cr�e un Iterator sur notre liste
		Iterator i = listParties.iterator();

		while (i.hasNext()) {
			// On recr�e l'Element courant � chaque tour de boucle afin de
			// pouvoir utiliser les m�thodes propres aux Element comme :
			// s�lectionner un n�ud fils, modifier du texte, etc...
			Element courant = (Element) i.next();
			// On affiche le nom de l��l�ment courant
			System.out.println(courant.getChild("carte").getText());
		}
	}

}
