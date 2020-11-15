package sandeepstructure.com;

import java.util.Scanner;

public class General_31 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ??");
		int number=sc.nextInt();
		int sum=0;
		for(int i=1;i<=number/2;i++)
		{
			if(number%i==0)
				sum=sum+i;
			//sum+=i;
		}
		if(sum==number)
			System.out.println(number+" Is Perfect Number");
		else
			System.out.println(number+ " Is Not Perfect Number");	
	}

}
