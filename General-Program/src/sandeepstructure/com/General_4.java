package sandeepstructure.com;

import java.util.Scanner;

public class General_4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N Value ?");
		int N=sc.nextInt();
		System.out.println("Enter R value ?");
		int R=sc.nextInt();
		int combination=factorial(N)/(factorial(R)*factorial(N-R));
		System.out.println("Combination : " +combination);
		
		int permutation=factorial(N)/factorial(N-R);
		System.out.println("Permutation " +permutation);
	}

	private static int factorial(int number)
	{
		int fact=1;
		int i=1;
		while(i<=number)
		{
			fact=fact*i;
			i++;
		}
		return fact;
	}
}
/*
Enter N Value ?
4
Enter R value ?
6
Combination : 0
Permutation 24
*/
