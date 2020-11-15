package sandeepstructure.com;

import java.util.Scanner;

public class General_20 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of Array ?");
		int length=sc.nextInt();
		int arr[]=new int[length];
		System.out.println("Enter " + length + " Length of array ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int result=gcdFindMethod(arr,length);
		System.out.println("Gcd of Given Number is: " +  result);
	}

	private static int gcdFindMethod(int[] arr, int length)
	{
		int result=0;
		for(int element:arr)
		{
			result=gcd(result,element);
			if(result==1)
			{
				return 1;
			}
		}
		return result;
	}

	private static int gcd(int result, int element)
	{
		if(result==0)
			return element;
		return gcd(element%result,result);
	}
}
/*
Enter Length of Array ?
2
Enter 2 Length of array 
24
54
Gcd of Given Number is: 6
*/
