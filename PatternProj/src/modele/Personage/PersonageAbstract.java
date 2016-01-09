package modele.Personage;

import java.util.List;

import modele.Comportement.Combat.ComportementCombatAbstract;
import modele.Comportement.Deplacement.ComportementDeplacementAbstract;
import modele.Comportement.Interaction.ComportementInteractionAbstract;

public class PersonageAbstract {
	
	// Information sur le personnage
	private int DefaultPosition;
    private String Name;
   
    
    // Comportement du personnage
    private ComportementCombatAbstract ComportementCombat ;
    private ComportementDeplacementAbstract ComportementDeplacement ;
    private ComportementInteractionAbstract  ComportementInteraction ;
    
      // Etat majo du personnage
   

}
