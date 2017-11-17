package panel;

import java.util.Iterator;

public class MyPanel {

	
	public static Iterator<Integer> panel1 (final int a,final int b) {
		
		
		Iterator<Integer> p = new  Iterator<Integer>() { //La classe anonyme : Au lieu d'externaliser le code, on le met ici ! LA classe n'a pas de nom, principe de l'annonymat!
			
			private int bornsup=b;
			private int borninf=a;
			private int actual=a; //Pointe vers l'élément actuel


			public boolean hasNext() {
				
				return (actual <= bornsup);
			}
			
			public Integer next() {
				
				return actual++;
			}

		};
		
		return p;
				
	}

	
	
	public static void main (String [] args) {
		
		Iterator<Integer> it=panel1(1,5);
		for(;it.hasNext();)
		System.out.println(it.next()); // affiche 1 2 3 4 5
	}
	
	
}