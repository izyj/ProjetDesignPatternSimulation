package modele.Personage;

import java.util.List;

import modele.Comportement.Combat.ComportementCombatAbstract;
import modele.Comportement.Deplacement.ComportementDeplacementAbstract;
import modele.Comportement.Interaction.ComportementInteractionAbstract;
import modele.ObjectItem.ObjectItemAbstract;
import modele.map.Zone;

public abstract class Personnage {

	// Information sur le personnage
	private Zone DefaultPosition;
    private String Name;
    protected List<ObjectItemAbstract> Objects;
    protected int vie;
    protected int attaque;
    // Comportement du personnage
    private ComportementCombatAbstract ComportementCombat ;
    private ComportementDeplacementAbstract ComportementDeplacement ;
    private ComportementInteractionAbstract  ComportementInteraction ;

    // Etat majo du personnage




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
	public ComportementCombatAbstract getComportementCombat() {
		return ComportementCombat;
	}
	public void setComportementCombat(ComportementCombatAbstract comportementCombat) {
		ComportementCombat = comportementCombat;
	}
	public ComportementDeplacementAbstract getComportementDeplacement() {
		return ComportementDeplacement;
	}
	public void setComportementDeplacement(ComportementDeplacementAbstract comportementDeplacement) {
		ComportementDeplacement = comportementDeplacement;
	}
	public ComportementInteractionAbstract getComportementInteraction() {
		return ComportementInteraction;
	}
	public void setComportementInteraction(ComportementInteractionAbstract comportementInteraction) {
		ComportementInteraction = comportementInteraction;
	}


}
