package sandeepstructure.com;

import java.util.Scanner;

public class General_3 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Age For Checking Vote ?");
	int age=sc.nextInt();
	vote(age);	
}

private static void vote(int age)
{
	if(age < 18)
	{
		System.out.println("Sorry ! You are bellow 18.");
	}
	else
		System.out.println("Welcome To vote .");
}
}
/*
Enter Age For Checking Vote ?
22
Welcome To vote .
*/
/*
Enter Age For Checking Vote ?
17
Sorry ! You are bellow 18.
*/
