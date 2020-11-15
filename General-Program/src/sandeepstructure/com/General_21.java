package sandeepstructure.com;

import java.util.Scanner;

public class General_21
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number  ? ");
		int x=sc.nextInt();
		System.out.println("Enter Second Number ?");
		int y=sc.nextInt();
		int result=gcd(x,y);
		System.out.println("Gcd Of Two Number : "+result);
	
	}
	private static int gcd(int x, int y)
	{
		int gcdf=1;
		for(int i=1;i<=x && i<=y;i++)
		{
			if(x%i==0 && y%i==0)
				gcdf=i;
		}
		return gcdf;
		//System.out.println(gcdf);
	}

}
