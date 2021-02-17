package abstraction;

public class Test1 {
	
	int roll ;
	String name;
	static String org = "home";
	
	Test1 (int roll,String name){
		this.roll=roll;
		this.name=name;
		
	}
	
	
	
	public void show() {
		System.out.println(roll+" "+name+" "+org);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 t1=new Test1(101,"jyoti");
		t1.show();
		Test1 t2 = new Test1(102,"Suchi");
		t2.show();

	}

}
