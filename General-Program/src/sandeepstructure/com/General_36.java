package sandeepstructure.com;

import java.util.Scanner;

public class General_36
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any NUmber ? ?");
		int number=sc.nextInt();
		boolean flag=false;
		for(int i=2;number/2>=i;++i)
		{
			//condition for nonprime number;
			if(number%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println(number+ " Is a Prime Number");
		else
			System.out.println(number+ " Is Not Prime Number");
	}

}
