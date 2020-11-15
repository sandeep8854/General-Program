package sandeepstructure.com;
import java.util.Scanner;
public class General_33
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		if(num>0)
			System.out.println(num+" Given Number is postive integer:");
		else
			System.out.println(num +" Given number is negative Integer" );
	}
}
