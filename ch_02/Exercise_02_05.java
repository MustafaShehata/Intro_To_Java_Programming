package ch_02;
/*
(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total.
*/
import java.util.Scanner;

public class Exercise_02_05 {
    public static void main(String[] args) {
        // create an object from class Scanner
        Scanner input = new Scanner(System.in);
        
        // prompt user to enter the subtotal and gratuity rate
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        
        // compute the gratuity in dollars and add it to subtoltal
        double gratuityInDollars = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuityInDollars;
        
        // print out the results of gratuity and total
        System.out.println("The gratuity is $" + gratuityInDollars + 
                " and total is $" + total);
    }
}
