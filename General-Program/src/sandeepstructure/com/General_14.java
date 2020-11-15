package sandeepstructure.com;

import java.util.Scanner;

public class General_14
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ?? ");
		int number=sc.nextInt();
		
		int even=0;
		int odd=0;
		
		while(number >= 1)
		{
			if(number%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			number--;
		}
		System.out.println(even + " Even Number ");
		System.out.println(odd + " Odd Number ");
	}

}
/*
Enter Any Number ?? 
45
22 Even Number 
23 Odd Number 
*/