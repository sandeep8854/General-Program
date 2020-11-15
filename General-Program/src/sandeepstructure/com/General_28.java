package sandeepstructure.com;

import java.util.Scanner;

public class General_28 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Year ? ? ?");
		int year=sc.nextInt();
		if((year%400==0 )|| (year%4==0 && year%100!=0))
		{
			System.out.println(year+ " Leap Year.");
		}
		else
			System.out.println(year+ " Not Leap Year.");
	}

}
