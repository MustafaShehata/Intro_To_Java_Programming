/*
(Financial application: monetary units) Rewrite Listing 2.10, 
ComputeChange.java, to fix the possible loss of accuracy 
when converting a double value to an int value. 
Enter the input as an integer whose last two digits represent the cents. 
For example, the input 1156 represents 11 dollars and 56 cents.
*/
package ch_02;

// Use Scanner Class from java.util
import java.util.Scanner;

public class Exercise_02_22 {
    public static void main(String[] args) {
        // Create an object from Scanner 
        Scanner input = new Scanner(System.in);
        
        // Recieve the amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        int amount = input.nextInt();
        int actualAmount = amount;
        
        // Find the number of one dollars
        int numberOfOneDollars = amount/100;
        amount %= 100;
        
        // Find the number of quarter in the remaining amount
        int numberOfQuarters = amount / 25;
        amount %= 25;
        
        // Find the number of dimes in the remaining amount 
        int numberOfDimes = amount / 10;
        amount %= 10;
        
        // Find the number of nickels in the remaining amount
        int numberOfNickels = amount / 5;
        amount %= 5;
        
        // Find the number of pennies in the remaining amount
        int numberOfPennies = amount;
        
        // Display results
        System.out.println("Your amount " + actualAmount + " consists of");
        System.out.println("       " + numberOfOneDollars + " dollars");
        System.out.println("       " + numberOfQuarters + " quarters ");
        System.out.println("       " + numberOfDimes + " dimes");
        System.out.println("       " + numberOfNickels + " nickels"); 
        System.out.println("       " + numberOfPennies + " pennies");
    }
}
