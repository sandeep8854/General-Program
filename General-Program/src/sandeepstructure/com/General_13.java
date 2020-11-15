package sandeepstructure.com;

import java.util.Scanner;

public class General_13
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any  Number ?? ");
		int number=sc.nextInt();
		int i=2;
		while(number >=i)
		{
			System.out.println(i);
			i=i+2;
		}
	}

}
/*
Enter Any  Number ?? 
10
2
4
6
8
10
*/