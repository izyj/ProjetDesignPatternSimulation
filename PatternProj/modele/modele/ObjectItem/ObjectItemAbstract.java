
package modele.ObjectItem;

import modele.map.Zone;

public abstract class ObjectItemAbstract {
	
	protected String Name;
	protected  Zone Position; // changement de type de Position lors du creation de context du Zone 

	public ObjectItemAbstract(String name, Zone position) {
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
	public Zone getPosition() {
		return Position;
	}
	public void setPosition(Zone position) {
		Position = position;
	}
	

}
