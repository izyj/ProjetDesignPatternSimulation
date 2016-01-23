package modele.map;

import java.util.ArrayList;
import java.util.List;

import modele.Personnage;
import modele.ObjectItem.ObjectItemAbstract;

public class Case extends Zone{

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

}
