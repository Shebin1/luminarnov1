package Array;

import java.util.Scanner;

public class Vowelcount {

	public static void main(String[] args) {
		Vowelcount v= new Vowelcount();
		System.out.println("enter a string");
		Scanner sc= new Scanner(System.in); 
		String s=sc.next();
		v.vowelcount(s);
	

	}
public void vowelcount(String s)

{
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			count++;
		}
			
	}
	System.out.println(count);
	
}
}
