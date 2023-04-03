package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionpgm {


	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		
		
		
	try {//try catch method
	int c=10/0;
	}
	catch(Exception a) {
		System.out.println(a.getMessage());
	}
	System.out.println("hi sarath");
	
	
	try {//try catch method
	String s=null;
	
	System.out.println(s.length());
	}
	catch(Exception a) {
		System.out.println(a.getMessage());
	}
	
System.out.println("hi alen");
	
FileInputStream f=new FileInputStream("E://book1.xlsx");

	}
}
