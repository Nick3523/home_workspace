package panel;

import java.util.List;
import java.util.AbstractList;

public class Mult {
	
	public static AbstractList <Integer> mult (final int facteur,final List<Integer> l) {
	
		AbstractList <Integer> p = new  AbstractList <Integer>() {

			@Override
			public Integer get(int index) {
				// TODO Auto-generated method stub
				return l.get(index)*facteur;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return l.size();
			}
			
		
		};
		
		
		return p;
		
		
		
	}

}