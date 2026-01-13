/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer:");
		int z = sc.nextInt();
		System.out.print("Please enter an integer:");
		int y = sc.nextInt();
		if(z < y) System.out.println("these variables are different");
		if(z > y) System.out.println("these variables are different");
		if(z == y) System.out.println("These variables are the same");
	}
}
