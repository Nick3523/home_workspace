package window;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

//L'astuce : Avoir un panneau en paramètre; et passer le panneau affiché plus loin en paramètre au constructeur, et agir directement sur ce dernier dans MouseDragged()

public class Mouser implements MouseMotionListener {

	static int x;
	static int y=0;
	Panneau p;
	public Mouser(Panneau pan) {

		p = pan;
	
	}

	@Override
	public void mouseDragged(MouseEvent evt) {

		
		p.setPosX(evt.getX());
	    p.setPosY(evt.getY());
	    p.repaint();
		
	}

	@Override
	public void mouseMoved(MouseEvent evt) {
		//System.out.println(evt.getX()+" "+evt.getY());
		p.setPosX(evt.getX());
	    p.setPosY(evt.getY());
	    p.repaint();
	
	
	}

	  public static void main(String[] args){       
		  
		  @SuppressWarnings("unused")
		Fenetre f = new Fenetre();
	
	  }


}
