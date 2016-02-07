package modele.map;

import java.util.List;

import javax.swing.JLabel;

import modele.Personnage;
import modele.ObjectItem.ObjectItemAbstract;

/**
 * Une Zone peut etre une case comme etre plusieurs case
 * @author Jonathan
 *
 */
public abstract class Zone extends JLabel
{
	protected int X, Y;
    protected List<Zone> liens;
    protected List<Personnage> personages;
    protected List<ObjectItemAbstract> objects;

    public abstract void ajouterlien(Zone zoneCible);
    public abstract Boolean lienExiste(Zone zoneCible);

	public Zone(int x, int y, List<Zone> liens, List<Personnage> personages,
			List<ObjectItemAbstract> objects) {
		super();
		X = x;
		Y = y;

		this.liens = liens;
		this.personages = personages;
		this.objects = objects;

	}

	public Zone(int x, int y) {
		super();
		X = x;
		Y = y;
	}
	
	public String Afficher(){

        return " X : " + X + ", Y : " + Y ;
    }
	
	/**
	 * Cette methode permet de recuperer la ligne de la case
	 * @return int
	 */
	public int getLigne() {
		return X;
	}
	
	public void setLigne(int x) {
		X = x;
	}
	
	/**
	 * Cette methode retourne la colonne de la case
	 * @return int
	 */
	
	public int getColonne() {
		return Y;
	}
	
	public void setColonne(int y) {
		Y = y;
	}
	
	public List<Zone> getLiens() {
		return liens;
	}
	
	public void setLiens(List<Zone> liens) {
		this.liens = liens;
	}
	
	public List<Personnage> getPersonages() {
		return personages;
	}
	
	public void setPersonages(List<Personnage> personages) {
		this.personages = personages;
	}
	
	public List<ObjectItemAbstract> getObjects() {
		return objects;
	}
	
	public void setObjects(List<ObjectItemAbstract> objects) {
		this.objects = objects;
	}

}


