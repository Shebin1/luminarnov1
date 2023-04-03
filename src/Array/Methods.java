package Array;

public class Methods {

	public static void main(String[] args) {
		
	Methods ob=new Methods();
	ob.add();
	ob.sub(20, 30);
	int an=ob.mul();
	System.out.println("multiplication= "+an);
	double c1=ob.div(20,30);
	System.out.println(c1);
	}
	

//1. method without return type and method without parameter
		public void add()
		{
		int a=20, b=10;
		int sum=a+b;
		System.out.println(sum);
		}
		
		
//2. method without return type and method with parameter.
		public void sub(int a, int b)
		{
			int sub=a-b;
			System.out.println(sub);
		}
		
		
//3.method with return type and method without parameter.
		public int mul()
		{
		int a=20, b=50;
		int ans=a*b;
		return ans;
		}
		
		
//4.mthod with return type and method with parameter
       public double div(int a,int b)	
       {
    	   double c=a/b;
    	   return c;
       }
  
       
       
       
       
}
