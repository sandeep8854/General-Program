package sandeepstructure.com;

import java.util.Scanner;

public class General_9
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ??");
		int number=sc.nextInt();
		int digits=0;
		int temp=number;
		int sum=0;
		/*while(number > 0)
		{
			digits++;
			number=number/10;
		}*/
	//	temp=number;
		while(number > 0)
		{
			
		int	reminder=number%10;
		 sum=sum+(int)Math.pow(reminder,digits);
		 number=number/10;
		 digits--;	
		}
		
		if(temp==sum)
			System.out.println("It is Disarium Number..");
		else
			System.out.println("It is Not Disarium Number..");
	}
}
/*
Enter Any Number ??
148
It is Not Disarium Number..
*/
