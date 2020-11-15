package sandeepstructure.com;

import java.util.Scanner;

public class General_6 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Day Number Like As 1,2,3...7");
		int day_number=sc.nextInt();
		if(day_number==1)
			System.out.println("Sunday");
		else if(day_number==2)
			System.out.println("Monday");
		else if(day_number==3)
			System.out.println("Tuesday");
		else if(day_number==4)
			System.out.println("Wednesday");
		else if(day_number==5)
			System.out.println("Thursday");
		else if(day_number==6)
			System.out.println("Friday");
		else if(day_number==7)
			System.out.println("Saturday");
		else
			System.out.println("Invalid Day...");
	}

}
/*
Enter Any Day Number Like As 1,2,3...7
4
Wednesday
*/