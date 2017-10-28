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
		fenetre.setTitle("Ma première fenêtre Java");
		fenetre.setSize(400, 300);		
		//Nous demandons maintenant à notre objet de se positionner au centre
		fenetre.setLocationRelativeTo(null);		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	    fenetre.setResizable(true);
	    pan.setBackground(Color.RED);
	    fenetre.setContentPane(pan);
	    
	    fenetre.setVisible(true);

	    go();
	}
	
	  private void go(){
		  //Principe : Si je dépasse la taille du panneau : Je recule. 		SINON J'avance, Réculer = décrementez les coordoonées X et Y; Avancer = les incrémenter
		  
		    for(;;){
		     
    	  int x = pan.getPosX(), y = pan.getPosY();
    	  
    	  //Le booléen pour savoir si l'on recule ou non sur l'axe x
    	  boolean backX = false;
    	  //Le booléen pour savoir si l'on recule ou non sur l'axe y
    	  boolean backY = false;

    	  //Dans cet exemple, j'utilise une boucle while
    	  //Vous verrez qu'elle fonctionne très bien
    	  while(true){
    	    //Si la coordonnée x est inférieure à 1, on avance
    	    if(x < 1)
    	      backX = false;

    	    //Si la coordonnée x est supérieure à la taille du Panneau moins la taille du rond, on recule
    	    if(x > pan.getWidth()-50)
    	      backX = true;

    	    //Idem pour l'axe y
    	    if(y < 1)
    	      backY = false;
    	    if(y > pan.getHeight()-50)
    	      backY = true;

    	    //Si on avance, on incrémente la coordonnée
    	    //backX est un booléen, donc !backX revient à écrire
    	    //if (backX == false)
    	    if(!backX)
    	      pan.setPosX(++x);

    	    //Sinon, on décrémente
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
		      
		      //Si nos coordonnées arrivent au bord de notre composant
		      //On réinitialise
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
