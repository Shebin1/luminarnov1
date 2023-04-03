package oops;

public class Polymorphism {

	public static void main(String[] args) {
		Polymorphism nw =new Polymorphism();
		nw.add();
		nw.add(10, 050);
        nw.add(10, 10.50);
        nw.add(20.5, 100);
		
		
		
	}
	
	public void add()
	{
	int a=10; int b=20;
	int s=a+b;
	System.out.println(s);
	}
	public void add(int a,int b)
	{
		int s=a+b;
		System.out.println(s);
	}

	public void add(int a,double b)//diffrent method
	{
		double s=a+b;
		System.out.println(s);
	}
	public void add(double a,int b) //diffrent order
	{
	double s=a+b;
	System.out.println(s);
	}
	
	
	
	
	

}
