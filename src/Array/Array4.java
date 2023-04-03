package Array;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		
		
int sum=0;
Scanner sc=new Scanner(System.in);
int[] a= new int[4];
System.out.println("enter numbers");

for(int i=0;i<=3;i++)
{
	a[i] = sc.nextInt();

}
for(int i=0;i<=3;i++)
{
	sum=sum+a[i];
}

	
	System.out.println("sum of numbers= "+sum);


	}

}
