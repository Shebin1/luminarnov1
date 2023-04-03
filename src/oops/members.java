package oops;
class member
{

	String name,address;
	int age;
String phoneno;
    String salary;
   
   public void printdetails()
    {
    	System.out.println("name:"+name);
    	System.out.println("address:"+address);
    	System.out.println("age"+age);
    	System.out.println("phoneno:"+phoneno);
    	System.out.println("salary:"+salary);
    }
}
class employee1 extends member
{
 String specialization;
}
class manager extends member
{
	 String department;
	
}

public class members{

	public static void main(String[] args) {
	member m= new member();
m.name="sarath";
m.address="kalapurakal house";
m.age=23;
m.phoneno="9947263254";
m.salary="25000";
m.printdetails();

employee1 e=new employee1();
e.name="alen";
e.address="kakknad";
e.phoneno="1234567880";
e.salary="20000";
e.age=25;
System.out.println(e.specialization="qa");
e.printdetails();

manager mg=new manager();
mg.name="alen";
mg.address="kakknad";
mg.phoneno="1234567880";
mg.salary="20000";
mg.age=25;
System.out.println(mg.department="flutter");
mg.printdetails();
	}
}

