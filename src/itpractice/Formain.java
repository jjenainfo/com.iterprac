package itpractice;

import java.util.LinkedList;
import java.util.List;

public class Formain {

	public static void main(String[] args) {
	 List<Integer> l=new LinkedList<Integer>();
	 l.add(1);
	 l.add(2);
	 l.add(3);
	 System.out.println(l);
	 
	 List<Integer> s=new LinkedList<Integer>();
	 s.add(7);
	 s.add(8);
	 s.add(9);
	 System.out.println(s);
	 
	 for (int a:l) {
		 for(int b:s) {
			 if(a<b) {
				 System.out.print(a + "");
				 
			 }
		 }
		
	}
	 

	}

}
