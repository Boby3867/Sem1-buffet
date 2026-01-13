/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int random =((int)(Math.random()*1000));
		while(true){
        System.out.print("Please enter a number between 1 and 1000: ");
        	int guess = sc.nextInt();
			if(guess == random){
			System.out.print("You got the number!!! Congrats!");
            break;
        	}
		else if (random > guess) 
		{
		System.out.println("Your number was too low, guess again.");
		}
		else
		{
		System.out.println("Your number was too high, guess again.");
		}
		}
    }
}

