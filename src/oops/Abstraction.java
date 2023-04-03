package oops;

abstract class car
{
	public abstract void speedlimit(); // abstract method we canot create a object in a abstract class.
	public abstract void airbagdtls(); // abstract method

	public void cardtls()
	{
		System.out.println("cardtls"); // normal method
	}
}
class skoda extends car

{

	@Override
	public void speedlimit() {
		System.out.println("skoda speed limit");
		
	}

	@Override
	public void airbagdtls() {
		System.out.println("skoda airbag dtls");
		
	}
}
	class audi extends car
	{

		@Override
		public void speedlimit() {
		System.out.println("audi speed limit");
			
		}

		@Override
		public void airbagdtls() {
			System.out.println("");
			
		}
		
	}
	




public class Abstraction {

	public static void main(String[] args) {
skoda s=new skoda();
s.airbagdtls();
s.speedlimit();
s.cardtls();

audi a=new audi();
a.airbagdtls();
a.cardtls();
a.speedlimit();
			

	}

}
