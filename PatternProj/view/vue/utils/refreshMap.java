package vue.utils;

import java.awt.Container;

public class refreshMap extends Thread{
	
	//A mettre de coté, a voir pour le refresh de la map
	
	private Container currJFrame;
	
	/**
	 * Start la map
	 * @param jFrame
	 */
	public refreshMap(Container jFrame){
		this.currJFrame=jFrame;
		start();
	}
	
	/**
	 * Rafraichi la map
	 */
	public void run(){
		try{
			currJFrame.repaint();
			sleep(40);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
