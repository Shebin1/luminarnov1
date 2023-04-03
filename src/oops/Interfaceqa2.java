package oops;

import java.util.Scanner;

interface bank{
	void accountdetails();
	void deposit();
	void withdraw();
}
class axis implements bank{
	int accountno;
	int balance=10000;
Scanner s=new Scanner(System.in);

	@Override
	public void accountdetails() {
		System.out.println("accountname");
		String name=s.next();
		System.out.println("accountnumber");
		int accountno=s.nextInt();
		System.out.println("accountname= "+name+"accountnumber= "+accountno);
		
	}

	@Override
	public void deposit() {
	System.out.println("enter your deposit amount");
		int depositamount=s.nextInt();
		balance=depositamount+balance;
		System.out.println("deposit amount= "+depositamount+"after deposit amount= "+balance);
		}

	@Override
	public void withdraw() {
		System.out.println("enter your withdrawal amount");
		int withdrawamount=s.nextInt();
		balance=withdrawamount-balance;
		System.out.println("withdrawal amount= "+withdrawamount+"finalbalance= "+balance);
	}
	
}

public class Interfaceqa2 {

	public static void main(String[] args) {
		axis ax=new axis();
		ax.accountdetails();
		ax.deposit();
		ax.withdraw();
		
		
		

	}

}
