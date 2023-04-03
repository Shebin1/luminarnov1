package oops;
interface tvremote
{
	void power();
}
interface smarttvremote extends tvremote{
	void volume();
}
class tv implements smarttvremote {

	@Override
	public void volume() {
		System.out.println("powe on");
		
	}

	@Override
	public void power() {
		System.out.println("check volume");
		
	}
	
}





public class Interfaceqa {

	public static void main(String[] args) {
		tv ob=new tv();
		ob.power();
		ob.volume();
		

	}

}
