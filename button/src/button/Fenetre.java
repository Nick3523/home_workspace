package button;


import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;





@SuppressWarnings("serial")
public class Fenetre extends JFrame{
	
		//Attributs
	  private JPanel pan = new JPanel();
	  private JButton bouton = new JButton("Mon bouton");

	  
	  	//Constructeur
	  public Fenetre(){
		  
	    this.setTitle("Animation");
	    this.setSize(300, 150);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    
	    //Ajout du bouton à notre content pane
	    BorderLayout bl = new BorderLayout();
	    this.setLayout(bl);
	    pan.add(bouton,BorderLayout.NORTH);
	    //this.getContentPane().add(bouton,bl.WEST);
	    this.setContentPane(pan);
	    this.setVisible(true);
	  } 
     
	}