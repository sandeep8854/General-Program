package sandeepstructure.com;

import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class General_18 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		System.out.println("Enter First Player Name ???");
		String fplayer=sc.next();
		System.out.println("Enter Second Player Name ???");
		String splayer=sc.next();
		
		System.out.println(fplayer + " Press Any key to flip the dice");
		sc.next();
		int frandom=rd.nextInt(5)+1;
		
		System.out.println(splayer + " Press Any  key to flip the dice ");
		sc.next();
		int srandom=rd.nextInt(5)+1;
		System.out.println(fplayer + " Score is " +frandom);
		System.out.println(splayer + " Score is " +srandom);
		
		if(frandom > srandom)
		{
			System.out.println(fplayer + " Congratulation !! Won The Game..");
		}
		else if(srandom > frandom)
		{
			System.out.println(splayer + " Congratulation !! Won The Game..");
		}
		else
		{
			System.out.println("Drow");
		}		
	}

}
/*
Enter First Player Name ???
Sandeep
Enter Second Player Name ???
Vinod
Sandeep Press Any key to flip the dice
g
Vinod Press Any  key to flip the dice 
j
Sandeep Score is 4
Vinod Score is 4
Drow*/
/*
 * Enter First Player Name ???
Sandeep 
Enter Second Player Name ???
Vinod
Sandeep Press Any key to flip the dice
s
Vinod Press Any  key to flip the dice 
v
Sandeep Score is 4
Vinod Score is 1
Sandeep Congratulation !! Won The Game..
*/
