package sandeepstructure.com;
import java.util.Scanner;
public class General_1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(n1>n2 && n1<n2)
			System.out.println(n1+ " Is Biggest NUmber: ");
		else
			System.out.println(n2+ " Is  Biggest Number");
	}
}
/*
Enter The Number
45
98
98 Is  Biggest Number
*/