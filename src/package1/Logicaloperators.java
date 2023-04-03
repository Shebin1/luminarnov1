package package1;

public class Logicaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//logical operators &&, ||, !
		String username="abc";
		String pswd="abc123";
		System.out.println(username=="abc" && pswd=="abc123"); //true
		System.out.println(username=="abc" ||pswd=="abc123"); //true
		System.out.println(username=="abc" ||pswd=="abc12"); //true
		System.out.println(username=="abc" && pswd=="abc12"); //false
		System.out.println(!(username=="abc")); //false		
	}

}
