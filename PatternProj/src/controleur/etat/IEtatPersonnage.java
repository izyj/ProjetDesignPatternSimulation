package controleur.etat;

public interface IEtatPersonnage {
	
	
	public void actionDormir(AutomateEtat context);
	
	public void actionSeReveiller(AutomateEtat context);
	
	public void actionManger(AutomateEtat context);
	
	public void actionMort(AutomateEtat context);
	
	public void actionPersoAttaque(AutomateEtat context);
		
	public void actionPersoImmobile(AutomateEtat context);
	
	public void actionPersoEnDeplacement(AutomateEtat context);
	

}
