/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter an integer for Stars ");
    int x = sc.nextInt();
    int star = 0;
    int row = 0;
           while(row < x){
            while(star < row+1){
            System.out.print("*");
            star = star + 1;
                }
            System.out.println();
            star = 0;
            row = row + 1;
            }
		}	
    }
