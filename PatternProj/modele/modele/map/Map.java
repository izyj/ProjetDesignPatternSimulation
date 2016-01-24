package modele.map;

import java.util.List;

import modele.Personnage;
import modele.ObjectItem.ObjectItemAbstract;

public interface  Map{

    public abstract void AddZone(int x, int y, String typeCase);
    public abstract Zone GetZone(int x, int y, String typeCase);

    public abstract void ChargerObjet(List<ObjectItemAbstract> objets,List<Zone> zones);
    public abstract void chargerPersonnage(List<Personnage> personages);

    public abstract void supprimerObjet(ObjectItemAbstract obj,List<Zone> zones);
    public abstract void supprimePersonnage(Personnage perso);

    public abstract void ajouterPersonnageInZone(Personnage perso, Zone position);

    public abstract void afficherEnvironment(Personnage personage);

    public abstract List<List<Zone>> recupererGrille();

    public abstract void lieZone();



}
