/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules: "); 
		System.out.println("1. Each player starts with $100."); 
		System.out.println("2. Input a wager less than your total amount of money."); 
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10."); 
		System.out.println("   a. If two numbers match, you double your money."); 
		System.out.println("   b. If three numbers match, you triple your money."); 
		System.out.println("   c. If none match, you lose your money."); 
		System.out.println("--------------------------------------------------"); 
		System.out.println("                                                   "); 
		int money =  100;
		while(money > 0){ 
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : "); 
        String clase = sc.nextLine();
        System.out.print("You have $" + money + ". How much would you like to wager? ");
        while(true){
        	int cost = sc.nextInt();
        	    if(money >= cost){
        	                money -= cost;
        System.out.println(" ");
        System.out.println("Great! Let's play!!!");
        System.out.println("Your rolls are: ");
        System.out.println("_______________________");
        int random1 =((int)(Math.random()*10+1));
        int random2 =((int)(Math.random()*10+1));
        int random3 =((int)(Math.random()*10+1));
        System.out.println(" | " + random1 + " | " + random2 + " | " + random3 + " | ");
        System.out.println("_______________________");
        	if(random1 == random2 && random3 == random2){
        	System.out.println("wow You won! You're wager has now been Tripled!");
        	cost *= 3;
        	money += cost;
        	System.out.println("You now have $" + money + ".");
            System.out.println("");
            System.out.println("--------------------------------------------------");
        	}
        	else if (random1 == random2 || random1 == random3 || random2 == random3){
        	System.out.println("You won! You're wager has now been double!");
            cost *= 2;
        	money += cost;
        	System.out.println("You now have $" + money + ".");
            System.out.println("");
            System.out.println("--------------------------------------------------");
        	}
            else if (random1 != random2 || random1 != random3 || random2 != random3){
                System.out.println("Didn't win this time, better luck next time!!");
                System.out.println("You now have $" + money + ".");
                System.out.println("");
                System.out.println("--------------------------------------------------");
            }
		    break;
        	    }
        	    else{
        	    System.out.println("no try again");
        	    System.out.print("You have $" + money + ". How much would you like to wager? ");
        	    }
        }
       
		    }
	    System.out.println("You've run out of money! Thanks for coming! Come back soon!");
	    }
	}
	


