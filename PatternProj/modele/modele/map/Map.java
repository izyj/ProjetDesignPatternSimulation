package modele.map;

import java.util.List;

import modele.Personnage;
import modele.ObjectItem.ObjectItemAbstract;

public interface  Map{

    public abstract void AddZone(int x, int y, String typeCase);
    public abstract Zone GetZone(int x, int y, String typeCase);

    public abstract void ChargerObjet(List<ObjectItemAbstract> objets,List<Zone> zones);
    public abstract void ChargerPersonage(List<Personnage> personages);

    public abstract void SupprimerObjet(ObjectItemAbstract obj,List<Zone> zones);
    public abstract void SupprimePersonage(Personnage perso);

    public abstract void AjouterPersonageInZone(Personnage perso, Zone position);

    public abstract void AfficherEnvironment(Personnage personage);

    public abstract List<List<Zone>> recupererGrille();



}
