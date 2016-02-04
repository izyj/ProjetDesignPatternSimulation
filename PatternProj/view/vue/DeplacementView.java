package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controleur.moteurJeu.MoteurSimuDeplacement;
import modele.Guerrier;
import modele.Personnage;
import modele.Iinterface.IObservable;
import modele.Iinterface.IObservateur;
import modele.Keys.EnumElementPlateau;
import modele.map.Case;
import modele.map.Zone;

public class DeplacementView extends JFrame implements IObservateur {

	/**
	 *
	 */
	private static final long serialVersionUID = 9070277143989091903L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlateauSimuDeplacement t = new PlateauSimuDeplacement();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DeplacementView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173,161,118));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	@Override
	public void actualiser(IObservable o) {
		
		
		
		this.repaint();
	}

}
