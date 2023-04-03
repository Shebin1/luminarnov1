package oops;

class RBI{
	
int a;
String b;


	public RBI(int a,String b)
	{
		this.a=a;
		this. b=b;
		
		System.out.println(+a+" " +b);
	}
 int salary=1000;
	public void interest()
	
	{
		System.out.println("interest per is 7%");
		
	}
}
class SBI extends RBI
{
public SBI()
{
super(10,"sarath");

}

	@Override
	public void interest() {
		System.out.println("interest per is 6%");
		System.out.println("min salary is "+super.salary);
		super.interest();
	}
	
}

public class Overriding {
	
	

	public static void main(String[] args) {

SBI sb=new SBI();
sb.interest();
	}

}
