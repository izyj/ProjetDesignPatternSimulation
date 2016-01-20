package modele.map;

import java.util.List;

import modele.Personnage;
import modele.ObjectItem.ObjectItemAbstract;

public class Case extends Zone{


	public Case(int x, int y, List<Zone> liens, List<Personnage> personages, List<ObjectItemAbstract> objects) {
		super(x, y, liens, personages, objects);

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

}
