package utils;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import modele.Personnage;

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

		// Url de test � virer quand impl�ment� dans les differents boutons.
		File test = new File("C:\\Users\\Gaetan\\Desktop\\partie1.xml");

		// On cr�e une instance de SAXBuilder.
		SAXBuilder sxb = new SAXBuilder();
		Document document = null;

		try {
			// On cr�e un nouveau document JDOM avec en argument le fichier XML.
			document = sxb.build(test);
		} catch (Exception e) {
		}

		// On initialise un nouvel �l�ment racine avec l'�l�ment racine du document.
		racine = document.getRootElement();

		getCarte();
		getPersonnage();
		// return null;
	}

	/**
	 * R�cup�re la carte dans le fichier XML.
	 * 
	 * @return carte
	 */
	static String getCarte() {

		String carte = "";

		// On cr�e une List contenant tous les noeuds "carte" de l'Element racine.
		List<Element> listParties = racine.getChildren("carte");

		// On cr�e un Iterator sur notre liste
		Iterator<Element> i = listParties.iterator();

		while (i.hasNext()) {
			// On recr�e l'Element courant � chaque tour de boucle afin de
			// pouvoir utiliser les m�thodes propres aux Element comme :
			// s�lectionner un n�ud fils, modifier du texte, etc...
			Element courant = (Element) i.next();

			carte = courant.getText();
			System.out.println(carte);
		}
		return carte;
	}
	
	/**
	 * R�cup�re les infos du personnage du fichier XML.
	 * @return personnage
	 */
	static Personnage getPersonnage() {

		Personnage personnage = new Personnage() {
			public void seReposer(int i) {}
			public int attaque() {return 0;}
			public void KO() {}
		};
		
		// On cr�e une List contenant tous les noeuds "carte" de l'Element racine.
		List<Element> listParties = racine.getChildren("personnage");

		// On cr�e un Iterator sur notre liste
		Iterator<Element> i = listParties.iterator();

		while (i.hasNext()) {
			// On recr�e l'Element courant � chaque tour de boucle afin de
			// pouvoir utiliser les m�thodes propres aux Element comme :
			// s�lectionner un n�ud fils, modifier du texte, etc...
			Element courant = (Element) i.next();
			personnage.setName(courant.getChildText("nom"));
			personnage.setVie(Integer.parseInt(courant.getChildText("vie")));
			personnage.setForce(Integer.parseInt(courant.getChildText("force")));
			personnage.setAttaque(Integer.parseInt(courant.getChildText("attaque")));
		}
		return personnage;
	}

}
