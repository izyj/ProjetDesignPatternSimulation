package modele.map;

import java.util.List;

import modele.ObjectItem.ObjectItemAbstract;
import modele.Personage.Personnage;

public abstract class Zone
{
    public int X, Y, Z;
    public List<Zone> liens;
    public List<Personnage> personages;
    public List<ObjectItemAbstract> objects;

    public abstract void ajouterlien(Zone zoneCible);
    public abstract Boolean lienExiste(Zone zoneCible);
   
    
   

   
	public Zone(int x, int y, int z, List<Zone> liens, List<Personnage> personages,
			List<ObjectItemAbstract> objects) {
		super();
		X = x;
		Y = y;
		Z = z;
		this.liens = liens;
		this.personages = personages;
		this.objects = objects;
	}
	public String Afficher(){
		
        return " X : " + X + ", Y : " + Y + ", Z : " + Z;
    }
}


