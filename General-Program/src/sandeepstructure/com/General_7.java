package sandeepstructure.com;

import java.util.Scanner;

public class General_7 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ?? ? ");
		int number=sc.nextInt();
		int count=0;
		do {
		//	count++;
			number=number/10;
			count++;
		}while(number!=0);
		System.out.println("Number Of Digits " +count );
		
		
	}

}
/*
Enter Any Number ?? ? 
456
Number Of Digits 3
*/
