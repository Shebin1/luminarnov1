package oops;

class animal
{
 void eat()
	{
		System.out.println("eating....");
	
	}
}
class dog extends animal
{
	void bark()
	{
		System.out.println("barking..");
	}
	
}
class babydog extends dog
{
	void play()
	{
		System.out.println("playing..");
	}
}
	
public class Inheritancemultilevel {
	public static void main(String[] args) {
		babydog d=new babydog();
		 d.eat();
		 d.bark();
		 d.play();
}
}
