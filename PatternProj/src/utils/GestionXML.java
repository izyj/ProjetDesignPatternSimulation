package utils;

import java.io.File;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import modele.Arme;
import modele.Personnage;
import modele.armes.Arc;
import modele.armes.Dague;
import modele.armes.Epee;
import modele.armes.Fusils;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

/**
 * Classe de gestion des données du fichier XML de la partie.
 * @author Gaetan
 *
 */
public class GestionXML implements GestionXMLService{

	static Element racine;

	 public String lectureFichierXML(File url){
//	public static void main(String[] args) {

		// Url de test à virer quand implémenté dans les differents boutons.
//		File url = new File("C:\\Users\\Gaetan\\Desktop\\partie1.xml");

		// On crée une instance de SAXBuilder.
		SAXBuilder sxb = new SAXBuilder();
		Document document = null;

		try {
			// On crée un nouveau document JDOM avec en argument le fichier XML.
			document = sxb.build(url);
		} catch (Exception e) {
		}

		// On initialise un nouvel élément racine avec l'élément racine du document.
		racine = document.getRootElement();

		Hashtable<String, Integer> dim = getDimensionCarte();
		String carte = getCarte();
		Personnage perso = getPersonnage();
		Arme uneArme = getArme();
		
		Hashtable<int[][], String> mapTap = getTabMap(carte);
	
		 return null;
	}

	/**
	 * Récupère la carte dans le fichier XML.
	 * 
	 * @return carte
	 */
	public String getCarte() {

		String carte = "";
		
		// On crée une List contenant tous les noeuds "carte" de l'Element racine.
		List<Element> listParties = racine.getChildren("map");

		// On crée un Iterator sur notre liste
		Iterator<Element> i = listParties.iterator();

		while (i.hasNext()) {
			Element courant = (Element) i.next();
			
			carte = courant.getChildText("carte");
			System.out.println(carte);
		}
		return carte;
	}
	
	/**
	 * Récupère la dimension de la carte dans le fichier XML.
	 * 
	 * @return carte
	 */
	public Hashtable<String, Integer> getDimensionCarte() {
		
		Hashtable<String, Integer> dimCarte = new Hashtable<String, Integer>();
		
		// On crée une List contenant tous les noeuds "carte" de l'Element racine.
		List<Element> listParties = racine.getChildren("map");

		// On crée un Iterator sur notre liste
		Iterator<Element> i = listParties.iterator();

		while (i.hasNext()) {
			Element courant = (Element) i.next();
			
			dimCarte.put("x", Integer.parseInt(courant.getChild("taille").getChildText("x")));
			dimCarte.put("y", Integer.parseInt(courant.getChild("taille").getChildText("y")));
			System.out.println(courant.getChild("taille").getChildText("x"));
			System.out.println(courant.getChild("taille").getChildText("y"));
		}
		
		return dimCarte;
	}
	
	/**
	 * Retourne la map dans un tableau avec position X et Y
	 * @param map, dimension
	 * @return tabMap
	 */
	public Hashtable<int[][], String> getTabMap(String map){
		
		Hashtable<int[][], String> tabMap = new Hashtable<int[][], String>();
		
		String[] ligneMap = map.split("\\n");
		
		for (int x=0; x < ligneMap.length-1; x++){
			String[] symbolParLigne = ligneMap[x].split("");
			for(int y=0; y < symbolParLigne.length; y++){
				int coordonnees[][] = {{x},{y}};
				tabMap.put(coordonnees, symbolParLigne[x+1]);
			}
		}
		
		return tabMap;	
	}
	
	/**
	 * Récupère les infos du personnage du fichier XML.
	 * @return personnage
	 */
	public Personnage getPersonnage() {

		Personnage personnage = new Personnage() {
			public void seReposer() {}
			public int attaque() {return 0;}
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
	public Arme getArme() {

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
