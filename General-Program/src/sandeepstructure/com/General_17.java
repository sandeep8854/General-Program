package sandeepstructure.com;

import java.util.Scanner;
/*
 * The Fibonacci series is a series where the next term is the sum of the previous two terms. 
//The first two terms of the Fibonacci sequence are 0 followed by 1.
 */
public class General_17 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number to find between Fibonacci series ? ?");
		int number=sc.nextInt();
		int i=1;
		int temp1=0;
		int temp2=1;
		while(number>=i)
		{
			System.out.print(" "+temp1);
			int sum=temp1+temp2;
			    temp1=temp2;
			      temp2= sum;
			      i++;
		}	
	}

}
/*
Enter Any Number to find between Fibonacci series ? ?
10
 0 1 1 2 3 5 8 13 21 34
*/