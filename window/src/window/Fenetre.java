package window;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.JFrame;
@SuppressWarnings("serial")
public class Fenetre extends JFrame {

	public Fenetre() throws HeadlessException {
	    
		JFrame fenetre = new JFrame();	    	    
		fenetre.setTitle("Ma première fenêtre Java");
		fenetre.setSize(400, 300);		
		//Nous demandons maintenant à notre objet de se positionner au centre
		fenetre.setLocationRelativeTo(null);		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	    fenetre.setResizable(true);
	   // fenetre.setUndecorated(false);
	    
	   /* JPanel panel = new JPanel ();
	    panel.setBackground(Color.RED);*/ 
	    fenetre.setContentPane(new Panneau());
	    fenetre.setVisible(true);

	}

	public Fenetre(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public Fenetre(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public Fenetre(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

}
