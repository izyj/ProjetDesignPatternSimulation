package modele.Map;

import java.util.ArrayList;
import java.util.List;

import modele.Personne;
import modele.ObjectItem.ObjectItemAbstract;
import modele.Zone.Carre;
import modele.Zone.Zone;

public class Grille extends Map {

	 public Grille()
     {
         Zones = new ArrayList<Zone>();
     }
	@Override
	public void AddZone(int x, int y) {
		Zones.add(new Carre(x, y)) ;
	}

	@Override
	public Zone GetZone(int x, int y) {
		return null;
		
	}

	@Override
	public void ChargerObjet(List<ObjectItemAbstract> objets) {
		
		
	}

	@Override
	public void ChargerPersonage(List<Personne> personages) {
		
	}

	@Override
	public void SupprimerObjet(ObjectItemAbstract obj) {
		
	}

	@Override
	public void SupprimePersonage(Personne perso) {
		
	}

	@Override
	public void AjouterPersonageInZone(Personne perso, Zone position) {
			
	}

	@Override
	public void AfficherEnvironment(Personne personage) {
		
	}
	

}
