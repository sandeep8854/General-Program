package sandeepstructure.com;

import java.util.Random;
import java.util.Scanner;

public class General_5 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		int count=0;
		while(true)
		{
			count++;
			System.out.println("Guess The NUmber Between 0 to 9 ");
			int number=sc.nextInt();
			int randomNumber=random.nextInt(10);
			
			if(number==randomNumber)
			{
				System.out.println("Congratulation !! YOu Won The Game..");
				System.out.println("You Have Taken " + count+ " Chances");
				break;
			}
			else
			{
				System.out.println("Sorry !! You Loss The Game..And It Was " +randomNumber);
			}
		}	
	}

}
/*
Guess The NUmber Between 0 to 9 
3
Sorry !! You Loss The Game..And It Was 7
Guess The NUmber Between 0 to 9 
3
Sorry !! You Loss The Game..And It Was 6
Guess The NUmber Between 0 to 9 
1
Sorry !! You Loss The Game..And It Was 9
Guess The NUmber Between 0 to 9 
4
Sorry !! You Loss The Game..And It Was 3
Guess The NUmber Between 0 to 9 
6
Sorry !! You Loss The Game..And It Was 3
Guess The NUmber Between 0 to 9 
2
Sorry !! You Loss The Game..And It Was 3
Guess The NUmber Between 0 to 9 
3
Sorry !! You Loss The Game..And It Was 5
Guess The NUmber Between 0 to 9 
6
Sorry !! You Loss The Game..And It Was 3
Guess The NUmber Between 0 to 9 
1
Sorry !! You Loss The Game..And It Was 5
Guess The NUmber Between 0 to 9 
2
Sorry !! You Loss The Game..And It Was 7
Guess The NUmber Between 0 to 9 
3
Sorry !! You Loss The Game..And It Was 5
Guess The NUmber Between 0 to 9 
7
Congratulation !! YOu Won The Game..
You Have Taken 12 Chances
*/