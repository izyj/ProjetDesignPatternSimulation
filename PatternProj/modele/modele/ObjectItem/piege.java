package modele.ObjectItem;

import modele.Arme;
import modele.map.Zone;


public class piege  extends  ObjectItemAbstract{

	public piege(String name, Zone position) {
		super(name, position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Afficher() {
		
		StringBuilder obj = new StringBuilder();
         obj.append(Name).append(" (Piege)\n");
         if (Position != null)
             obj.append(" - Position : ").append(Position.Afficher());

         return obj.toString();
     }
	}



