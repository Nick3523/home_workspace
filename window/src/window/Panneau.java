package window;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panneau extends JPanel {

	  private int posX = -50;
	  private int posY = -50;
	  
	  public int getPosX() {
		    return posX;
		  }

		  public void setPosX(int posX) {
		    this.posX = posX;
		  }

		  public int getPosY() {
		    return posY;
		  }

		  public void setPosY(int posY) {
		    this.posY = posY;
		  }
	  
	  public void paintComponent(Graphics g){
		  
		  
		  	g.setColor(Color.WHITE);
		    g.fillRect(0, 0, this.getWidth(), this.getHeight()); //Poue masquer le rond d'avant, on repeint tout en blanc pour ensuite repeindre le rond dans les nouvelles positions !

		    //Vous verrez cette phrase chaque fois que la méthode sera invoquée
		    System.out.println("Je suis exécutée !"); 
		  	g.setColor(Color.RED);
		    g.fillOval(posX, posY, 75, 75);

		  }

}
