package panel;

import java.awt.List;
import java.util.AbstractList;
import java.util.Iterator;

public class Panel  {
	
	
	
	
	public static Iterator<Integer> panel1 (int a,int b) {
		
		PanelIterator p = new PanelIterator(a,b);
		return p;
				
	}

	//Question 3 : utiliser iterable !
	
	public static Iterable <Integer> panel2 (final int a,final int b) {
		
		Iterable<Integer> p = new  Iterable<Integer>() {

			public Iterator<Integer> iterator() {
				return panel1(a,b);
			}
		};
		
		return p;
		
	}
	
	public static AbstractList <Integer> panel (final int a,final int b) {
		
		 AbstractList <Integer> p = new  AbstractList <Integer>() {
			 		
			@Override
			public Integer get(int index) {
			
				return a+index;
			}

			@Override
			public int size() {
			
				return b-a+1;
			}
						 
			 
		 };
		
		
		return p;
		
		
	}
	
	
	public static void main (String [] args) {
		
		
		System.out.println("-------------ITERATOR-----------------");

		Iterator<Integer> it=panel1(1,5);
		for(;it.hasNext();)
		System.out.println(it.next()); // affiche 1 2 3 4 5
		
		System.out.println("-------------ITERABLE-----------------");
		
		for(int i:panel2(1,5))
		System.out.println(i); // affiche 1 2 3 4 5 rappele la méthode déjà défini plus haut
		
		
		System.out.println("-----------ABSTRACTLIST-------------------");

		
		AbstractList <Integer> l = panel(3,6);
		for(int i:l) {
		System.out.println(i);
		//affiche 3 4 5 6
		}
		System.out.println("l.get(1) =  "+l.get(1)); //affiche 4
		
	}



}