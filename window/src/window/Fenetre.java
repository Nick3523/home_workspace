package window;

import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.JFrame;
@SuppressWarnings("serial")
public class Fenetre extends JFrame {
	Panneau pan = new Panneau();

	public Fenetre() throws HeadlessException {
	    
		
		JFrame fenetre = new JFrame();	    	    
		fenetre.setTitle("Ma premi�re fen�tre Java");
		fenetre.setSize(400, 300);		
		//Nous demandons maintenant � notre objet de se positionner au centre
		fenetre.setLocationRelativeTo(null);		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	    fenetre.setResizable(true);
	    pan.setBackground(Color.RED);
	    fenetre.setContentPane(pan);
	    
	    fenetre.setVisible(true);

	    go();
	}
	
	  private void go(){
		  //Principe : Si je d�passe la taille du panneau : Je recule. 		SINON J'avance, R�culer = d�crementez les coordoon�es X et Y; Avancer = les incr�menter
		  
		    for(;;){
		     
    	  int x = pan.getPosX(), y = pan.getPosY();
    	  
    	  //Le bool�en pour savoir si l'on recule ou non sur l'axe x
    	  boolean backX = false;
    	  //Le bool�en pour savoir si l'on recule ou non sur l'axe y
    	  boolean backY = false;

    	  //Dans cet exemple, j'utilise une boucle while
    	  //Vous verrez qu'elle fonctionne tr�s bien
    	  while(true){
    	    //Si la coordonn�e x est inf�rieure � 1, on avance
    	    if(x < 1)
    	      backX = false;

    	    //Si la coordonn�e x est sup�rieure � la taille du Panneau moins la taille du rond, on recule
    	    if(x > pan.getWidth()-50)
    	      backX = true;

    	    //Idem pour l'axe y
    	    if(y < 1)
    	      backY = false;
    	    if(y > pan.getHeight()-50)
    	      backY = true;

    	    //Si on avance, on incr�mente la coordonn�e
    	    //backX est un bool�en, donc !backX revient � �crire
    	    //if (backX == false)
    	    if(!backX)
    	      pan.setPosX(++x);

    	    //Sinon, on d�cr�mente
    	    else
    	      pan.setPosX(--x);

    	    //Idem pour l'axe Y
    	    if(!backY)
    	      pan.setPosY(++y);
    	    else
    	      pan.setPosY(--y);
		    	
		      pan.repaint();  
		      try {
		        Thread.sleep(5);
		      } catch (InterruptedException e) {
		        e.printStackTrace();
		      }
		      
		      //Si nos coordonn�es arrivent au bord de notre composant
		      //On r�initialise
		      if(x == pan.getWidth() || y == pan.getHeight()){
		        pan.setPosX(-50);
		        pan.setPosY(-50);
		      }
		    }
       }
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
