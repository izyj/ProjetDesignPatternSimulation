package modele.map;

import java.util.List;

import modele.Personnage;
import modele.ObjectItem.ObjectItemAbstract;

public abstract class Map{

	public List<Zone> Zones;

    public abstract void AddZone(int x, int y, int z);
    public abstract Zone GetZone(int x, int y, int z);



    public abstract void ChargerObjet(List<ObjectItemAbstract> objets);
    public abstract void ChargerPersonage(List<Personnage> personages);

    public abstract void SupprimerObjet(ObjectItemAbstract obj);
    public abstract void SupprimePersonage(Personnage perso);

    public abstract void AjouterPersonageInZone(Personnage perso, Zone position);

    public abstract void AfficherEnvironment(Personnage personage);



}
