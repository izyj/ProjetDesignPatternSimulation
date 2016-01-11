package modele.Comportement.Interaction;

public class InteractionObjetSurTerre extends ComportementInteractionAbstract {

	@Override
	public String CollectObject() {
		
		return "Je ramasse les objets";
	}

	@Override
	public String PoseObject() {
		
		return "Je pose les objets sur le sol !";
	}

}
