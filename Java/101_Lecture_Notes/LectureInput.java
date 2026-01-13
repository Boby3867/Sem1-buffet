/*
    Lecture note example - Input!!
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
	Scanner sc = new Scanner(System.in);
	System.out.println("Combo Double double $11.50");
    System.out.println("Combo Cheeseburger $9.30");
    System.out.println("Combo Hamburger $8.50");
    System.out.println("Double double $5.95");    
    System.out.println("Cheeseburger $3.80");
    System.out.println("Hamburger $3.00");
    System.out.println("Beverages $1.00");
    System.out.println("Shakes $4.00");
    System.out.println("French Fries $2.00");   
    
    System.out.println("who order is this");
    String name = sc.nextLine();
    System.out.println("how many Combo Double double");
    int item1 = sc.nextInt();
    System.out.println("how many Combo Cheeseburger");
    int item2 = sc.nextInt();
    System.out.println("how many Combo Hamburger");
    int item3 = sc.nextInt();
    System.out.println("how many Double double");
    int item4 = sc.nextInt();
    System.out.println("how many Cheeseburger");
    int item5 = sc.nextInt();
    System.out.println("how many Hamburger");
    int item6 = sc.nextInt();
    System.out.println("how many Beverages");
    int item7 = sc.nextInt();
    System.out.println("how many Shakes");
    int item8 = sc.nextInt();
    System.out.println("how many French Fries");
    int item9 = sc.nextInt();
    double price1 = item1 * 11.50;
    double price2 = item2 * 9.30;
    double price3 = item3 * 8.50;
    double price4 = item4 * 5.95;
    double price5 = item5 * 3.80;
    double price6 = item6 * 3.00;
    double price7 = item7 * 1.00;
    double price8 = item8 * 4.00;
    double price9 = item9 * 2.00;
    
    System.out.println(" how much would you like to tip");
    
    double total = price1 + price2 + price3 + price4 + price5 + price6 + price7 + price8 + price9; 
    
    System.out.println();
    System.out.println("------------------------");
    System.out.println(name +"s Receipt");
    System.out.println(item1 + " X Combo Double double = $" + price1);
    System.out.println(item2 + " X Combo Double double = $" + price2);
    System.out.println(item3 + " X Combo Double double = $" + price3);
    System.out.println(item4 + " X Combo Double double = $" + price4);
    System.out.println(item5 + " X Combo Double double = $" + price5);
    System.out.println(item6 + " X Combo Double double = $" + price6);
    System.out.println(item7 + " X Combo Double double = $" + price7);
    System.out.println(item8 + " X Combo Double double = $" + price8);
    System.out.println(item9 + " X Combo Double double = $" + price9);
    System.out.println("------------------------");
    System.out.println("The Grand Total is - " + total);
    }
}
