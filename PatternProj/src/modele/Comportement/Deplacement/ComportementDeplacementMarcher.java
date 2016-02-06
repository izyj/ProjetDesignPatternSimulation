package modele.Comportement.Deplacement;

import java.util.List;

import modele.Guerrier;
import modele.Personnage;
import modele.map.Case;


public class ComportementDeplacementMarcher  implements IComportementDeplacement{


	private List<Personnage> personages ;


	@Override
	public Case deplacer(eDirection direction) {


		for (Personnage personnage : personages) {
			if (personnage instanceof Guerrier) {


				if(direction==eDirection.VERS_LE_HAUT){

					return new Case(personnage.getPositionX(), personnage.getPositionY() - 1);	
				}
				else if(direction==eDirection.VERS_LE_HAUT){

					return new Case(personnage.getPositionX() + 1, personnage.getPositionY() );

				}else if(direction==eDirection.VERS_LE_HAUT){

					return new Case(personnage.getPositionX(), personnage.getPositionY() + 1);

				}else if(direction==eDirection.VERS_LE_HAUT){

					return new Case(personnage.getPositionX() - 1, personnage.getPositionY() );	
				}

			}
		}
		return null;

	}





}







