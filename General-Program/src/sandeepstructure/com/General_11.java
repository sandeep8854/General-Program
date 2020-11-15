package sandeepstructure.com;

import java.util.Scanner;

public class General_11
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ??");
		int number=sc.nextInt();
		int divisible_Count=1;
		int i=1;
		while(number/2 >=i)
		{
			if(number%i==0)
				divisible_Count++;
			i++;
		}
		System.out.println(" Number of Divisible: " +divisible_Count);
		
		
	}

}
/*
Enter Any Number ??
45
 Number of Divisible: 6
*/

