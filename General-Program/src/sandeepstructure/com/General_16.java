package sandeepstructure.com;

import java.util.Scanner;

public class General_16
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ???");
		int number=sc.nextInt();
		int fact=1;
		int i=2;
		while(number >= i)
		{
			fact=fact*i;
			i++;
		}
	/*	while(number >=i)
		{
			number=number*i;
			number--;
		}*/
		
		System.out.println(number +" != " +fact );	
	}

}
