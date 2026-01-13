/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an integer:");
		int item1 = sc.nextInt();
		System.out.println("Please enter an integer(bigger than the first):");
		int item2 = sc.nextInt();
		System.out.println("Your range is " + item1 + " to " + item2);
		System.out.println("Here are 6 numbers generated in that range.");
		System.out.println((int)(Math.random()*(item1-item2)+item2));
		System.out.println((int)(Math.random()*(item1-item2)+item2));
		System.out.println((int)(Math.random()*(item1-item2)+item2));
		System.out.println((int)(Math.random()*(item1-item2)+item2));
		System.out.println((int)(Math.random()*(item1-item2)+item2));
		System.out.println((int)(Math.random()*(item2-item1)+item1));
		String name = sc.nextLine(); 
	}
}
