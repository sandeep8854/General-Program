package sandeepstructure.com;

import java.util.Scanner;

public class General_8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number: ");
		int number=sc.nextInt();
		
	if(number >=-9 && number <=9)
		//if(number> 9 || number <-9)	
			System.out.println("Digit");
		else
			System.out.println("Number");	
	}
}
/*
Enter The number: 
4
Digit
*/
/*
Enter The number: 
145
Number
*/

