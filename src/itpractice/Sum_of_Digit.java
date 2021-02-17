package itpractice;

public class Sum_of_Digit {

	public static void main(String[] args) {
		int m=45612;
		int n=0;
		int sum=0;
	  
		while(m > 0) {
			n=m%10;
			sum=sum+n;
			m=m/10;
		}
		System.out.println(sum);

	}

}
