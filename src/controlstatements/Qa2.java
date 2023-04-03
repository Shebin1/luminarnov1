package controlstatements;

public class Qa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10,b=20;

char op ='+';
switch(op)
{

case '-': System.out.println("a-b="+(a-b));
break;
case'*': System.out.println("a*b="+(a*b));
break;
case '/':System.out.println("a/b="+(a/b));
break;
default: System.out.println("invalid");
case '+': if (b==0)
{
	System.out.println("a+b="+(a+b));
}else
	System.out.println("invalid");
}
	

	}

}

