package practice;

import java.util.Scanner;

public class RevNum {
	
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
	//	String no=s.nextLine();
		//int i = Integer.parseInt(no);
		int i = Integer.parseInt(s.nextLine());
		int rem,rev=0;

		
		while (i !=0) {
			rem=i%10;
			rev=rev*10+rem;
			i=i/10;
			
		}
		System.out.println(rev);
		

	}

}
