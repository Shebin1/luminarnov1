package Array;

public class Stringcase {

	public static void main(String[] args) {
	
	String s1="hello welcome to luminar";
	String s2="hello";	
	String s3="hello";
    String s4=new String("hello");
System.out.println(s1==s4); // compare memory location and content
System.out.println(s2==s3);// same


System.out.println(s1.equals(s2)); // .equals() -it's check content

System.out.println(s1.equalsIgnoreCase(s2)); 

System.out.println(s1.concat(s2)); //concat

System.out.println(s1.length()); //check length

System.out.println(s1.startsWith("h")); //check starting letter

System.out.println(s1.endsWith("e")); //check ending letter

System.out.println(s1.toUpperCase()); //showing upper case

System.out.println(s3.toLowerCase()); //showing content in lower case

System.out.println(s2.charAt(2)); // 

System.out.println(s2.trim()); //trim white space in starting and ending

System.out.println(s1.contains("welcome")); //check contain specific character

System.out.println(s1.substring(2,5)); // 

// split
String a=" hello welcome to luminar";
String ar[]=a.split(" ");
for(String v:ar)
{
	System.out.println(v);
}


	}

}
