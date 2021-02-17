package itpractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> l =new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		
		System.out.println(l);
		
		List<Integer> s = new LinkedList<Integer>();
		s.add(7);
		s.add(8);
		s.add(9);
		System.out.println(s);
		
		for (Iterator<Integer> i1=l.iterator();i1.hasNext();) {
			for (Iterator<Integer> i2=s.iterator();i2.hasNext();) {
				if(i1.next() < i2.next()) {
					System.out.println(i1.next());
					
				}
				
			}
			
		}
		

	}

}
