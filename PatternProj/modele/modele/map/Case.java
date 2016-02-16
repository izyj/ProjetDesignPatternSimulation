package modele.map;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import modele.Personnage;
import modele.Keys.EnumElementPlateau;
import modele.Keys.EnumTypePersonnage;
import modele.ObjectItem.ObjectItemAbstract;
import vue.utils.gestionImages;

public class Case extends Zone{
	
	Case next = null;
	Case previous = null;
	
	/**
	 *
	 * @param x  Ligne de la case
	 * @param y	 Colonne de la case
	 * @param liens
	 * @param personages
	 * @param objects
	 */
	public Case(int x, int y, List<Zone> liens, List<Personnage> personages, List<ObjectItemAbstract> objects) {
		super(x, y, liens, personages, objects);

	}
	
	public Case(int x, int y) {
		super(x,y);
		personages = new ArrayList<Personnage>();
		liens = new ArrayList<Zone>();
		objects = new ArrayList<ObjectItemAbstract>();
	}

	@Override
	public void ajouterlien(Zone zoneCible) {

		if (!lienExiste(zoneCible))
        {
			this.liens.add(zoneCible);
        }
		
	}

	@Override
	public Boolean lienExiste(Zone zoneCible) {

		return  liens.contains(zoneCible);
	}

	public void changerImageCase(EnumElementPlateau type){

		switch (type.toString()) {
	        case "personnage":  this.setIcon(new ImageIcon(gestionImages.getPersonnage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
	                   			break;
	        case "mur": 		this.setIcon(new ImageIcon(gestionImages.getMur().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
	        	       			break;
	        case "nourriture":  this.setIcon(new ImageIcon(gestionImages.getNourriture().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
	                   			break;
	        case "arme": 		this.setIcon(new ImageIcon(gestionImages.getArme().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
	                   			break;
	        case "fin":  		this.setIcon(new ImageIcon(gestionImages.getFin().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
	        		   			break;
	        case "tour":  		this.setIcon(new ImageIcon(gestionImages.getTour().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
			               		break;
	        case "monstre":  	this.setIcon(new ImageIcon(gestionImages.getMonstre().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
	                   			break;
	        case "sol":  	    this.setIcon(new ImageIcon(gestionImages.getSol().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
   								break;
	        default:   			this.Afficher();
	        		   			break;
		}
	}
	
	public Case getNext() {
		return next;
	}
	
	public void setNext(Case next) {
		this.next = next;
	}
	
	public Case getPrevious() {
		return previous;
	}
	
	public void setPrevious(Case previous) {
		this.previous = previous;
	}

}
