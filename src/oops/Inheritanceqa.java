package oops;
interface basicanimal //also act abstract
{
	void cat(); //abstract method.
	void sleep(); // abstract method.
	// we can not create object in a abstract method.
	
}
 class monkey
 {
	 public void jump() {
	 System.out.println("jump");
	 }
	 void bite() {
		 System.out.println("bite");
	 }
}
 class human extends monkey implements basicanimal{ // implements means we can inherite a 'interface' to a 'class' at the same time
	 //we can extends a class also.  'multiple' & 'hybrid' inheritance posible through 'interface' keyword
	 
 void speak()
 {
	 System.out.println("speaking");
 }
 
 
 

	@Override
	public void jump() {
System.out.println("jumping");
		
	}

	

	@Override
	public void cat() {
	System.out.println("meow");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleeping");
		
	}
	 
 }



public class Inheritanceqa {

	public static void main(String[] args) {
		
human h=new human();
h.bite();
h.jump();
h.sleep();
h.speak();

	}

}
