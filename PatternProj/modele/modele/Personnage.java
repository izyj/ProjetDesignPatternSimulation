package modele;

import java.util.List;

import controleur.etat.AutomateEtat;
import modele.Comportement.Combat.IComportementCombat;
import modele.Comportement.Deplacement.IComportementDeplacement;
import modele.Comportement.Deplacement.eDirection;
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
	protected int positionX;
	protected int positionY;
	protected AutomateEtat contexteEtat;

	// Comportement du personnage
	private IComportementCombat ComportementCombat ;
	private IComportementDeplacement ComportementDeplacement ;
	private IComportementInteraction  ComportementInteraction ;

	// Etat major du personnage

	
    public Personnage() {
    	super();
    }
    
	// constructeur
	public Personnage(Zone defaultPosition, String name,int force,int vie, boolean ko, IComportementCombat comportementCombat,
			IComportementDeplacement comportementDeplacement, IComportementInteraction comportementInteraction) {
		super();
		DefaultPosition = defaultPosition;
		Name = name;
		this.vie = vie;
		this.force=force;
		ComportementCombat = comportementCombat;
		ComportementDeplacement = comportementDeplacement;
		ComportementInteraction = comportementInteraction;
	}
	
   //Méthode Se reposer
	public abstract  void seReposer(int i);

   


   //Méthode permettra des dégats
	public abstract int attaque();

	//Méthode de déplacement de personnage
	public void seDeplacer(eDirection direction){

		ComportementDeplacement.deplacer(direction);
	}

	/**
	 * Methode permettant d'attaquer un autre personnage
	 * @param perso
	 */
	 public void combattre(Personnage perso){
	  		  
		ComportementCombat.Attaquer(perso);
		
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
	
	/**
	  * Retourne un boolean qui indique si le personnage est mort
	*/
	public boolean isKo() {
		if(this.vie <=0)
			return true;
		
		return false;
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
		
	public void actionAttaquer(Personnage ennemie){
		
		ennemie.setVie(ennemie.getVie()-this.attaque);
	}


	public AutomateEtat getContexteEtat() {
		return contexteEtat;
	}
	public void setContexteEtat(AutomateEtat contexteEtat) {
		this.contexteEtat = contexteEtat;

	}





	


}
