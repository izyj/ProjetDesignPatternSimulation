package utils;

import java.io.File;
import java.util.Hashtable;

import modele.Arme;
import modele.Personnage;

public interface GestionXMLService {

	public String lectureFichierXML(File url);

	public String getCarte();

	public Hashtable<String, Integer> getDimensionCarte();

	public Hashtable<int[][], String> getTabMap(String map);

	public Personnage getPersonnage();

	public Arme getArme();

}
