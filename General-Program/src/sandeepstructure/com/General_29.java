package sandeepstructure.com;

import java.util.Scanner;

public class General_29
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year ");
		int year=sc.nextInt();
		
		if(year%400==0)
		{
			System.out.println(year + " Laep Year.");
		}
		else if(year%4==0 && year%100!=0)
		{
			System.out.println(year + " Leap Year ");
		}
		else {
			System.out.println(year + " Not a Leap Year ");
		}
	}

}
