package oops;

class sarath // parent class
{
	void eat()
	{
		System.out.println("eating...."); 
	}
}


class father extends sarath //child class.. import datas from parent class
    {
	void anil()
	{
		System.out.println("sarath's father");
	}
    }


		class grandson extends sarath // child class import datas from parent class 		
		
		{
			void babu()
			{
				System.out.println("sarath's son");
			}
	}

public class Inheritancehierarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 father s=new father();
 s.eat();
 s.anil();
 grandson g= new grandson();
 g.eat();
 g.babu();

 
	}

}
