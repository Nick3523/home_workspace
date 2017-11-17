package panel;

import java.util.Iterator;

public class PanelIterator implements Iterator<Integer> {

	private int bornsup;
	private int borninf;
	private int actual; //Pointe vers l'élément actuel
	
	
	
	
	
	public PanelIterator(int a, int b) {
		super();
		this.bornsup = b;
		this.borninf = a;
		actual = borninf;
	}

	public boolean hasNext() {
		
		return (actual <= bornsup);
	}
	
	public Integer next() {
		
		return actual++;
	}


}