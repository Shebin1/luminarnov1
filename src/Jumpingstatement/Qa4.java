package Jumpingstatement;

import java.util.Scanner;

public class Qa4 {

	public static void main(String[] args) {
	System.out.println("enter 2 no");
	Scanner cl= new Scanner(System.in);
	int a=cl.nextInt();
	int b=cl.nextInt();
	System.out.println("enter operator");
	char op=cl.next().charAt(0);
	
	switch(op)
	{
	case '+':System.out.println(a+b);
	break;
	case '-':System.out.println(a-b);
	break;
	case '/':if(b==0) {
		System.out.println("not divisible by 0");
	}
	else {
		System.out.println(a/b);
	}
	break;
	}
	
	

	}

}
