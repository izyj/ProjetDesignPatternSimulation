package modele.Map;

import java.util.List;

import modele.Personne;
import modele.ObjectItem.ObjectItemAbstract;

import modele.Zone.Zone;

public abstract class Map{
	
	public List<Zone> Zones;

    public abstract void AddZone(int x, int y, int z);
    public abstract Zone GetZone(int x, int y, int z);

    

    public abstract void ChargerObjet(List<ObjectItemAbstract> objets);
    public abstract void ChargerPersonage(List<Personne> personages);

    public abstract void SupprimerObjet(ObjectItemAbstract obj);
    public abstract void SupprimePersonage(Personne perso);

    public abstract void AjouterPersonageInZone(Personne perso, Zone position);

    public abstract void AfficherEnvironment(Personne personage);
    
   

}
