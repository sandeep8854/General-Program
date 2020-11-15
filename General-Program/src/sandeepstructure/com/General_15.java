package sandeepstructure.com;

import java.util.Scanner;

public class General_15 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ??");
		int number=sc.nextInt();
		int evenCount=0,oddCount=0;
		while(number >=1)
		{
			if(number%2==0)
				evenCount++;
			else
				oddCount++;
			number--;
		}
		System.out.println(evenCount+ " Even Number" );
		System.out.println(oddCount+ " Odd Number");
	}

}
