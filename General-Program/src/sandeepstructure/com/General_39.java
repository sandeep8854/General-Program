package sandeepstructure.com;

import java.util.Scanner;

public class General_39 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		if(n<10 || n>99)
			System.out.println("Invalid input, Number Should have two Digit Only");
		else
		{
			//int d1=sc.nextInt();
			int d1=n%10;
		//	int d2=sc.nextInt();
			int d2=n/10;
			
			int sum=d1+d2;
			int products=d1*d2;
			if((sum+products)==n)
			{
				System.out.println(n+ " is a Special Two digit number");
			}
			else
			{
				System.out.println(n+ " Is Not A Special Two Digit Number");
			}
		}
	}

}
