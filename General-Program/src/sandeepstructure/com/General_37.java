package sandeepstructure.com;

import java.util.Random;
import java.util.Scanner;

public class General_37 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		Random randomNumber=new Random();
		System.out.println("Enter The Number Between 0 to 9 ");
		int userNumber=scan.nextInt();
		int randomNumber1=randomNumber.nextInt(10);
		
		if(userNumber==randomNumber1)
			System.out.println("Congratulation!!! You Won The Game..");
		else
			System.out.println("Sorry !! You Loss The Game Try Again. And It Was : "+randomNumber1);	
	}

}
