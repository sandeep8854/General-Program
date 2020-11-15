package sandeepstructure.com;

import java.util.Scanner;

public class General_2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number ??");
		int number1=sc.nextInt();
		
		System.out.println("Enter Second Number ??");
		int number2=sc.nextInt();
		
		System.out.println("Enter Third Number");
		int number3=sc.nextInt();
		
		int big=(number1>number2) ? number1 :number2;
		int big1=(big>number3) ? big :number3;
		
		
		
		
		
		
	}

}
