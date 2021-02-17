package practice;

import abstraction.Vehicle;


	public class Bike extends Vehicle{
		public void start() {
			
			System.out.println("start with kick");
			
		}

	public static void main(String[] args) {
	Bike b=new Bike();
	b.start();

	}

}
