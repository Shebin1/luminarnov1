package oops;

interface animal1
{
	public void animaldtls(); // abstract method
	public void animalfood(); //abstract method
	public void animalbreed();
}
interface birds
{
	public void birdfood();
	public void birdbreed();
	public void birddtls();
}
class dogs implements animal1,birds //we can achive multiple inheritance through interface
{

	@Override
	public void animaldtls() {
	System.out.println("dogdtls");
	}

	@Override
	public void animalfood() {
	
		System.out.println("chicken");
	
		
	}

	@Override
	public void animalbreed() {
		
		System.out.println("lab");
		
	}
	@Override
	public void birdfood() {
	System.out.println("porota");
		
	}
	@Override
	public void birdbreed() {
		System.out.println("hummingbird");
		
	}
	@Override
	public void birddtls() {
		System.out.println("birddtls");
		
	}
	
}






public class Interface {

	public static void main(String[] args) {
	dogs d=new dogs();
	d.animalbreed();
	d.animaldtls();
	d.animalfood();
	d.birdbreed();
	d.birddtls();
	d.birdfood();

	}

}
;