/*
(Financial application: monetary units) Modify Listing 2.10,
ComputeChange. java, to display the nonzero denominations only, 
using singular words for single units such as 
1 dollar and 1 penny, and plural words for more 
than one unit such as 2 dollars and 3 pennies.
*/
package ch_03;
import java.util.Scanner;
public class Exercise_03_07 {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();
        
        int remainingAmount = (int)(amount * 100);
        
        // Find the number of dollars
        int dollars = remainingAmount / 100;
        remainingAmount %= 100;
        
        // Find the number of quarters
        int quarters = remainingAmount / 25;
        remainingAmount %= 25;
        
        // Find the number of dimes
        int dimes = remainingAmount / 10;
        remainingAmount %= 10;
        
        // Find the number of nickels
        int nickels = remainingAmount / 5;
        remainingAmount %= 5;
        
        // Find the number of pennies
        int pennies = remainingAmount;
        
        // Display results according to singular units or plural words for more than one unit
        System.out.println("Your amount " + amount + " consists of");
	System.out.println(" " + dollars + (dollars == 1 ? " dollar" : " dollars"));
	System.out.println(" " + quarters + (quarters == 1 ? " quarter" : " quarters"));
        System.out.println(" " + dimes + (dimes == 1 ? " dime" : " dimes")); 
	System.out.println(" " + nickels + (nickels == 1 ? " nickel" : " nickels"));
	System.out.println(" " + pennies + (pennies == 1 ? " pennie" : " pennies"));
    }
}
