package sandeepstructure.com;

import java.util.Scanner;

public class General_40
{
	//Strong number is a special number whose sum of factorial of digit is equal to original number
		//eXAMPLE : 145 is strong number Since 1!+4!+5!=145
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Any Number ? ?");
			int number=sc.nextInt();
			int sum=0,temp=number;
			do {
				int reminder=number%10;
				int factorial=1;
				while(reminder > 1)
				{
					factorial=factorial*reminder;
					reminder--;
				}
				
				sum=sum+factorial;
				number=number/10;
				
			}while(number!=0);
				if(sum==temp)
					System.out.println(temp+ " Is Strong Number. ");
				else
					System.out.println(temp+ " Is Not Strong Number");
		}

}
