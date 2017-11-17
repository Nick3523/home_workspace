package panel;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		/*ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
		al.add(i);
		}
		
		AbstractList <Integer> m = Mult.mult (2,al);
		
		for(int i=0;i<m.size();i++) {
			
			System.out.println(m.get(i)+" ");
		}*/
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
			for (int i = 0; i < 100000; i++) {
				al.add(i);
		}
			
		long t0 = System.nanoTime();
		List<Integer> ret = Mult.mult(2, al);
		long sum=0;
		
		for(int val : ret) {
			sum+=val/2;
		}
		
		System.out.println((System.nanoTime() - t0));
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		for (int i = 0; i < 100000; i++) {
			ll.add(i);
		}
		
		t0 = System.nanoTime();
		sum=0;
		ret = Mult.mult(2, ll);
		
		for(int val : ret) {
			sum+=val/2;
		}
		
		System.out.println((System.nanoTime() - t0));
		
		// ArrayList is faster than LinkedList if I randomly access its elements. I think random access means "give me the nth element". Why ArrayList is faster?

		
	}

}