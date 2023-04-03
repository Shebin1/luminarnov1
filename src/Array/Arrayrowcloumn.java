package Array;

import java.util.Scanner;

public class Arrayrowcloumn {

	public static void main(String[] args) {
		int[][]ar=new int[3][2]; //first row count, second one column count and AR means(array references)
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
			ar[i][j]=sc.nextInt();
		}
		}
for (int i=0;i<=2;i++)	
{
	for(int j=0;j<=1;j++)
	{
		System.out.print(ar[i][j]+" ");
	}
		System.out.println();
	
	}
}

	}


