package modele;

import java.util.Arrays;

/**
 * 
 * @author Gaetan
 *
 */
public class Coordonnees {

	int x;
	int y;
	
	public Coordonnees() {
		super();
	}
	
	public Coordonnees(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override 
	public String toString() { 
		 return ""+getX() + " "+ getY(); 
	}
	
	@Override
	public boolean equals(Object o){
		if (this==o)
			return true;
		if (o instanceof Coordonnees) {
			Coordonnees p = (Coordonnees)o;
 
			return this.x == p.x 
				&& this.y == p.y ;
		}
		return false;
	}
	
	@Override 
	public int hashCode() {
	    return Arrays.hashCode(new int[]{ this.x, this.y});
	}

}
