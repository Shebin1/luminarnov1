package oops;

public class Staticfinal {
final double pi=3.14;

static final String clgname="luminar";

static String nam="alen";

static String name="shebin";

	public static void main(String[] args) {
		System.out.println(name);//without object we can access static keyword's data.
		System.out.println(clgname);//"staticfinal"without object we can access staticfinal's keyword but we canot edit.
		Staticfinal st=new Staticfinal();
		System.out.println(st.pi);// we can't access without object and it's a constant value we can't change
        System.out.println(nam="sarath");//we can change the value 
	}

}
