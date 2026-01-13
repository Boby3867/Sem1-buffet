/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int am = 1;
		int tol = 0;
		while(am < 6){
			System.out.println("Enter your " + am + " grade");
			int grade = sc.nextInt();
			am = am + 1;
			tol += grade;
		}
		tol /= 5;
		System.out.println("your grade is " + tol);
		if(tol >= 90) System.out.println("You got an A");
		else if(tol >= 80) System.out.println("You got an B");
		else if(tol >= 70) System.out.println("You got an C");
		else if(tol >= 60) System.out.println("You got an D");
		else if(59 >= tol) System.out.println("You got an F");
	
		System.out.println("Enter a word");
		String word = sc.nextLine();
		if(word.equals("bug")){
		System.out.println("      ");
		System.out.println("      ");
		System.out.println("      ");			
		System.out.println("                 .                     ");
		System.out.println("      ");
		System.out.println("      ");	
		System.out.println("      ");
		}
		else if(word.equals("boat")){
		System.out.println("      ===|         ");
		System.out.println("   \\     |    /    ");
		System.out.println("    \\____|___/     ");	
		}
		else if(word.equals("sad")){
		System.out.println("___________________");
		System.out.println("|                 |");
		System.out.println("|  []         []  |");
		System.out.println("|                 |");
		System.out.println("|      _____      |");
		System.out.println("|    _|     |_    |");
		System.out.println("|  _|         |_  |");
		System.out.println("|                 |");
		System.out.println("|_________________|");
		}
		else{
		System.out.println("Invalid Input");	
		}
	}
}
