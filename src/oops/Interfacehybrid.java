package oops;

interface car2
{
	void speedlimint();
	
}
class skoda2 implements car2{

	@Override
	public void speedlimint() {
	System.out.println("skoda speedlimit");
	
      }
}
class jeep implements car2{

	@Override
	public void speedlimint() {
		// TODO Auto-generated method stub
		System.out.println("jeep speedlimit");
	  }
	
	
	
}

public class Interfacehybrid {

	public static void main(String[] args) {
		car2 ob=new skoda2();
		ob.speedlimint();
		ob=new jeep();
		ob.speedlimint();

	}
	

}
