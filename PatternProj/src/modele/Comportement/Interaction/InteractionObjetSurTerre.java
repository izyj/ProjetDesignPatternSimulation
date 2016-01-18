package modele.Comportement.Interaction;

public class InteractionObjetSurTerre implements IComportementInteraction {

	@Override
	public String CollectObject() {
		
		return "Je ramasse les objets";
	}

	@Override
	public String PoseObject() {
		
		return "Je pose les objets sur le sol !";
	}

}
