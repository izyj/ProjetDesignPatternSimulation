package modele;

import java.util.List;

import modele.Comportement.Combat.IComportementCombat;
import modele.Comportement.Deplacement.IComportementDeplacement;
import modele.Comportement.Interaction.IComportementInteraction;
import modele.ObjectItem.ObjectItemAbstract;
import modele.Zone.Zone;

public abstract class Personnage {

	int vie;
	int attaque;

	// Information sur le personnage
	private Zone DefaultPosition;
	private String Name;
	protected List<ObjectItemAbstract> Objects;

	// Comportement du personnage
	private IComportementCombat ComportementCombat ;
	private IComportementDeplacement ComportementDeplacement ;
	private IComportementInteraction  ComportementInteraction ;

	// Etat majo du personnage






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



}
