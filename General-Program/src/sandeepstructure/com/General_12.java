package sandeepstructure.com;

import java.util.Scanner;

public class General_12 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(n1==n2)
			System.out.println("It is equal");
		else
			System.out.println("It is not equal");
	}
}
/*
Enter The Number: 
45
65
It is not equal
*/