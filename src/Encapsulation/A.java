package Encapsulation;

public class A {
	
	private String name;
	private int roll;
	private int age;
	
	public String getName() {
		return name;
		
     }
	
	public int  getRoll() {
		return roll;
		
     }
	
	public int  getAge() {
		return age;
		
     }
   public void setName(String newname) {
	   name=newname;
   }
   
   public void setAge(int newage) {
	   age=newage;
   }
   
   public void setRoll(int newroll) {
	   roll=newroll;
   }



	
	
	

public static void main(String[] args) {
	
	A a=new A();
	a.setAge(20);
	a.setRoll(2);
	a.setName("Prabhu");
	
	System.out.println("name "+a.getName());
	
	System.out.println("roll "+a.getRoll());
	
	System.out.println("age "+a.getAge());

	}

}
