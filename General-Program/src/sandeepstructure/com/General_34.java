package sandeepstructure.com;

import java.util.Scanner;

public class General_34
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any NUmber ? ?");
		int number=sc.nextInt();
		boolean flag=false;
		int i=2;
		while(number/2 >=i)
		{
			//Condition for nonPrime number
			if(number%i==0)
			{
				flag=true;
				break;
			}
			++i;
		}
		if(!flag)
			System.out.println(number+ " Is A Prime NUmber.");
		else
			System.out.println(number+ " Is Not Prime Number.");
	}


}
