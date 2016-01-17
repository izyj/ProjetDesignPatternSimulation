package modele.Zone;

import java.util.List;

import modele.Personne;
import modele.ObjectItem.ObjectItemAbstract;

public abstract class Zone
{
    public int X, Y;
    public List<Zone> liens;
    public List<Personne> personages;
    public List<ObjectItemAbstract> objects;

    public abstract void ajouterlien(Zone zoneCible);
    public abstract Boolean lienExiste(Zone zoneCible);
   
    
   

   
	public Zone(int x, int y) {
		super();
		X = x;
		Y = y;
		
		this.liens = liens;
		this.personages = personages;
		this.objects = objects;
	}
	public String Afficher(){
		
        return " X : " + X + ", Y : " + Y ;
    }
}


