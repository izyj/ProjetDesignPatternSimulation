package modele;

import java.util.List;

import modele.Comportement.Combat.IComportementCombat;
import modele.Comportement.Deplacement.IComportementDeplacement;
import modele.Comportement.Interaction.IComportementInteraction;
import modele.ObjectItem.ObjectItemAbstract;
import modele.map.Zone;

public abstract class Personnage {



	// Information sur le personnage
	private Zone DefaultPosition;
	private String Name;
	protected List<ObjectItemAbstract> Objects;
	protected int vie;
	protected int force ;
	protected int attaque;
	protected boolean ko;
	protected int positionX;
	protected int positionY;

	// Comportement du personnage
	private IComportementCombat ComportementCombat ;
	private IComportementDeplacement ComportementDeplacement ;
	private IComportementInteraction  ComportementInteraction ;

	// Etat majo du personnage





	// constructeur
	public Personnage(Zone defaultPosition, String name,int force,int vie, boolean ko, IComportementCombat comportementCombat,
			IComportementDeplacement comportementDeplacement, IComportementInteraction comportementInteraction) {
		super();
		DefaultPosition = defaultPosition;
		Name = name;
		this.vie = vie;
		this.ko = ko;
		this.force=force;
		ComportementCombat = comportementCombat;
		ComportementDeplacement = comportementDeplacement;
		ComportementInteraction = comportementInteraction;
	}




    public Personnage() {
	super();
    }


   //Méthode Se reposer
	public abstract  void seReposer(int i);

   //Méthode KO Perdre la vie
	public abstract void KO();

   //Méthode permettra des dégats
	public abstract int attaque();


	//Méthode de déplacement de personnage
	public void seDeplacer(){

		ComportementDeplacement.deplacer();
	}

	//Méthode de Combattre de personnage
	public void combattre(){

		ComportementCombat.Attaquer();
	}

	//Méthode de PoseObject
	public void PoseObject(){

		ComportementInteraction.PoseObject();
	}
	//Méthode de Collect Object
	public void CollectObject(){

		ComportementInteraction.CollectObject();
	}


	// Getter & Setter
	public Zone getDefaultPosition() {
		return DefaultPosition;
	}
	public void setDefaultPosition(Zone defaultPosition) {
		DefaultPosition = defaultPosition;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<ObjectItemAbstract> getObjects() {
		return Objects;
	}
	public void setObjects(List<ObjectItemAbstract> objects) {
		Objects = objects;
	}
	public IComportementCombat getComportementCombat() {
		return ComportementCombat;
	}
	public void setComportementCombat(IComportementCombat comportementCombat) {
		ComportementCombat = comportementCombat;
	}
	public IComportementDeplacement getComportementDeplacement() {
		return ComportementDeplacement;
	}
	public void setComportementDeplacement(IComportementDeplacement comportementDeplacement) {
		ComportementDeplacement = comportementDeplacement;
	}
	public IComportementInteraction getComportementInteraction() {
		return ComportementInteraction;
	}
	public void setComportementInteraction(IComportementInteraction comportementInteraction) {
		ComportementInteraction = comportementInteraction;
	}




	public int getVie() {
		return vie;
	}




	public void setVie(int vie) {
		this.vie = vie;
	}




	public int getAttaque() {
		return attaque;
	}




	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}




	public boolean isKo() {
		return ko;
	}




	public void setKo(boolean ko) {
		this.ko = ko;
	}




	public int getPositionX() {
		return positionX;
	}




	public void setPositionColonne(int positionX) {
		this.positionX = positionX;
	}




	public int getPositionY() {
		return positionY;
	}




	public void setPositionLigne(int positionY) {
		this.positionY = positionY;
	}




	public int getForce() {
		return force;
	}




	public void setForce(int force) {
		this.force = force;
	}



}
