package modele.map;

import java.util.List;

import modele.ObjectItem.ObjectItemAbstract;
import modele.Personnage;

/**
 * Le carre represente les cases entourant une autre
 * @author Jonathan
 *
 */
public class Carre extends Zone
{


	public Carre(int x, int y, List<Zone> liens, List<Personnage> personages,
			List<ObjectItemAbstract> objects) {
		super(x, y, liens, personages, objects);

	}


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