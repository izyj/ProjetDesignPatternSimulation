package modele.ObjectItem;

public abstract class ObjectItemAbstract {
	
	private String Name;
	private  String Position; // changement de type de Position lors du creation de context du Zone 

	public ObjectItemAbstract(String name, String position) {
		super();
		Name = name;
		Position = position;
	}
	
	public abstract String Afficher();

	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	

}
