package window;

import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panneau extends JPanel {

	public Panneau() {
		// TODO Auto-generated constructor stub
	}

	public Panneau(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public Panneau(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public Panneau(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}
	
	  public void paintComponent(Graphics g){
		    //Vous verrez cette phrase chaque fois que la m�thode sera invoqu�e
		    System.out.println("Je suis ex�cut�e !"); 
		    g.fillOval(20, 20, 75, 75);
		    g.drawString("Tiens ! Le Site du Z�ro !", 100, 200);

		  }

}
