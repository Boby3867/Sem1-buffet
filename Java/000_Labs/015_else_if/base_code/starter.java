/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Pick a number between 1 - 1000: "); 
		int item = sc.nextInt();
		int random =((int)(Math.random()*1000));
		if (random == item1)
		{
		System.out.print("Your number was the random number WOW. ");
		System.out.print("The number was " + random);
		}
		else if (random > item1) 
		{
		System.out.print("Your number is smaller ");
		System.out.print("The number was " + random);
		}
		else
		{
		System.out.print("Your number is bigger ");
		System.out.print("The number was " + random);
		}
    }
}