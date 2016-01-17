package modele.map;

import java.util.List;

import modele.ObjectItem.ObjectItemAbstract;
import modele.Personage.Personnage;

public class Carre extends Zone
{
	public Carre(int x, int y, int z, List<Zone> liens, List<Personnage> personages,
			List<ObjectItemAbstract> objects) {
		super(x, y, z, liens, personages, objects);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void ajouterlien(Zone targetZone) {
		
            if (!lienExiste(targetZone))
            {
                liens.add(targetZone);
            }
        }
		
	

	@Override
	public Boolean lienExiste(Zone targetZone) {
		
		return  liens.contains(targetZone);
	}
   
}