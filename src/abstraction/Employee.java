package abstraction;

public class Employee {
	
	int empid;
	String emp_name;
	static String company = "home";
	
	public Employee(int empid,String emp_name) {
		this.empid=empid;
		this.emp_name= emp_name;
		
	}
   public void display() {
		System.out.println(empid+" "+emp_name+" "+company);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee(10,"jyoti");
		
		employee.display();
		
		Employee e= new Employee(11, "suchisam");
		e.display();
		
	

	}

}
