package Array;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
String[] a=new String[4];

System.out.println("enter names");

for(int i=0;i<=3;i++)

{
	a[i]=sc.next();
	}

for (int i=0;i<=3;i++)
{
	System.out.println("enter names= " + a[i]);
}

	}

}
