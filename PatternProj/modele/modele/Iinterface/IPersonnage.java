package modele.Iinterface;

import modele.map.Zone;

public interface IPersonnage {

	public int getVie();
	public void setVie(int vie);


	public int getAttaque();
	public void setAttaque(int force);
	public String getEtat();
	public void setEtat(String etat);

	/**
	 * Cette m�thode permet de r�cup�rer la zone dans laquelle se trouve le personnage
	 * @return Zone
	 */
	public Zone getPosition();
	public void AnalyseSituation();
	public void Execution();



}
