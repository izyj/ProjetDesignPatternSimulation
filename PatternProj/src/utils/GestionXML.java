package utils;

import java.io.File;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import modele.Arme;
import modele.Coordonnees;
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
//public class GestionXML implements GestionXMLService{
public class GestionXML{

	static Element racine;
	

	 public static Hashtable<Coordonnees, String> lectureFichierXML(){
     //public static void main(String[] args) {

		// Url de test à virer quand implémenté dans les differents boutons.
		  final File f = new File("");
		  String fichier = "ressources\\xml\\partie1.xml";
		  final String fichierPath = f.getAbsolutePath() + File.separator + fichier;
		  File url = new File(fichierPath);
		

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
		String carte = getCarte(dim);
		Personnage perso = getPersonnage();
		Arme uneArme = getArme();
		
		Hashtable<Coordonnees, String> mapTap = getTabMap(carte, dim);
	
		return mapTap;
	}

	/**
	 * Récupère la carte dans le fichier XML.
	 * @param dim 
	 * 
	 * @return carte
	 */
	public static String getCarte(Hashtable<String, Integer> dim) {

		String carte = "";
		
		// On crée une List contenant tous les noeuds "carte" de l'Element racine.
		List<Element> listParties = racine.getChildren("map");

		// On crée un Iterator sur notre liste
		Iterator<Element> i = listParties.iterator();

		while (i.hasNext()) {
			Element courant = (Element) i.next();
			for(int z=0; z< dim.get("y"); z++){
				carte += courant.getChild("carte").getChildText("ligne"+z) +"&";
			}
			
			System.out.println(carte);
		}
		return carte;
	}
	
	/**
	 * Récupère la dimension de la carte dans le fichier XML.
	 * 
	 * @return carte
	 */
	public static Hashtable<String, Integer> getDimensionCarte() {
		
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
	 * @param dim 
	 * @param map, dimension
	 * @return tabMap
	 */
	public static Hashtable<Coordonnees, String> getTabMap(String map, Hashtable<String, Integer> dim){
		
		Hashtable<Coordonnees, String> tabMap = new Hashtable<Coordonnees, String>();
		
		String[] ligneMap = map.split("&");
		
		for (int x=0; x < ligneMap.length; x++){
			String[] symbolParLigne = ligneMap[x].split("");
			for(int y=1; y < symbolParLigne.length; y++){
				Coordonnees coordonnees = new Coordonnees();
				coordonnees.setX(x);
				coordonnees.setY(y);
				tabMap.put(coordonnees, symbolParLigne[y]);	
			}
		}
		
		return tabMap;	
	}
	
	/** 
	 * Récupère les infos du personnage du fichier XML.
	 * @return personnage
	 */
	public static Personnage getPersonnage() {

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
	public static Arme getArme() {

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
