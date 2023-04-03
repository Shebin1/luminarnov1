package Array;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import oops.Employee;

public class Student {
int studentid;
String studentname;
String department;
public Student(int studentid,String studentname,String department)



{
	this.studentid=studentid;
	this.studentname=studentname;
	this.department=department;
}
public void display()
{
	System.out.println("studentid ="+studentid);
	System.out.println("studentname ="+studentname);
	System.out.println("department ="+department);
	
}

	public static void main(String[] args) {
		Student std1= new Student(101,"sarath","bcom");
		Student std2= new Student(102,"alen","btech");
		std1.display();
		std2.display();
		
		

		

	}

}
