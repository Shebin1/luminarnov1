package oops;

public class Employee {
int empid;
String empname;
String designation;
     public void display()
     {
	 System.out.println("empid ="+empid);
	 System.out.println("empname ="+empname);
	 System.out.println("designation ="+designation);
	 
	 
	 
}
	
	
	public static void main(String[] args) {
		Employee emp1= new Employee();
		emp1. empid=101;
		 emp1.empname="sarath";
		emp1. designation="tester";
		emp1.display();
		Employee emp2= new Employee();
		emp2. empid=102;
		 emp2.empname="alen";
		emp2. designation="developer";
		emp2.display();
		

	}

}
