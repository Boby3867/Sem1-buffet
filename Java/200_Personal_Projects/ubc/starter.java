/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to be a Wizard, Warrior, or Rogue? ");
		String clase = sc.nextLine();
		if (clase.equalsIgnoreCase("Wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if (clase.equalsIgnoreCase("Warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if (clase.equalsIgnoreCase("Rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else System.out.println("You've decided not to chose a role. Rerun program.");
		int art = 20;
		System.out.println("You have " + art + " skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		System.out.print("Strength (1-10):");
		int Strength = sc.nextInt();
		if (Strength > 10) System.out.println("Please input a smaller value.");
		else if (art < Strength) System.out.println("Please input a smaller value."); 
		else if (clase == ("Warrior")) Strength += 1;
		art -= Strength;
		System.out.println("You have " + art + " left to spend.");
		System.out.print("Dexterity (1-10):");
		int Dexterity = sc.nextInt();
		if (Dexterity > 10) System.out.println("Please input a smaller value.");
		else if (art < Strength) System.out.println("Please input a smaller value.");
		art -= Dexterity;
		System.out.println("You have " + art + " left to spend.");
		System.out.print("Intelligence (1-10):");
		int Intelligence = sc.nextInt();
		if (Intelligence > 10) System.out.println("Please input a smaller value.");
		else if (art < Intelligence) System.out.println("Please input a smaller value.");
		art -= Intelligence;
		System.out.println("You have " + art + " left to spend.");
		System.out.print("Charisma (1-10):");
		int Charisma = sc.nextInt();
		if (Charisma > 10) System.out.println("Please input a smaller value.");
		else if (art < Charisma) System.out.println("Please input a smaller value.");
		art -= Charisma;
		System.out.println("You have " + art + " to spend for next time.");
		System.out.println("--------------------------------------------------");
		System.out.println("You are, the of CVHS");
		System.out.println("You're a " + clase + " with the following stats!");
		System.out.println("Strength - " + Strength);
		System.out.println("Dexterity - " + Dexterity);
		System.out.println("Intelligence - " + Intelligence);
		System.out.println("Charisma - " + Charisma);
		System.out.println("Time to Adventure");
		System.out.println("You come across the Goblin and you fight");
		System.out.println("to fight roll a d6 die and add strength ");
		String op = sc.nextLine();
		if (op.equalsIgnoreCase("Roll")){
		int you =((int)(Math.random()*6+ Strength));
		int him =((int)(Math.random()*6));
		if (you >= him) {
		System.out.println("You win");
		}
		else{
		System.out.println("You lost you got ");}
		}
		else{
		System.out.println("You lost by not fighting, he takes your money");
		}
	}
}