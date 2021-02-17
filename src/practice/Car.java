package practice;

import abstraction.Vehicle;

public class Car extends Vehicle{
	public void start() {
		System.out.println("start with key");
	}

	
	
	public void main(String[] args) {
	Vehicle v=new Car();
	v.start();
	

	}

}

