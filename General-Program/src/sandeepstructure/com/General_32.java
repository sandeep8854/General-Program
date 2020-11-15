package sandeepstructure.com;

import java.util.Scanner;

public class General_32 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ??");
		int number=sc.nextInt();
		
		String result=(number>=0)?" Posive " : " Negative ";
		System.out.println(number + " Is " + result+ " Number ");
		
	}
}
