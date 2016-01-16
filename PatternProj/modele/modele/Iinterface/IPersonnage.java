package modele.Iinterface;

import modele.Zone;

public interface IPersonnage {

	public int getVie();
	public void setVie(int vie);


	public int getForce();
	public void setForce(int force);
	public String getEtat();
	public void setEtat(String etat);

	public Zone getPosition();
	public void AnalyseSituation();
	public void Execution();



}
