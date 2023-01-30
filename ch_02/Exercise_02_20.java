/*
(Financial application: calculate interest) If you know the balance 
and the annual percentage interest rate, you can compute the interest 
on the next monthly payment using the following formula: 
            interest = balance * (annualInterestRate/1200) 
Write a program that reads the balance and the annual percentage interest rate 
and displays the interest for the next month. 
*/
package ch_02;

// use Scanner class from java.util
import java.util.Scanner;

public class Exercise_02_20 {
    public static void main(String[] args) {
        // Create an object from Scanner 
        Scanner input = new Scanner(System.in);
        
        // prompt the user to enter a balance and an annual percentage interset rate 
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();
        
        // Compute the interest using the following formula:
        double interest = balance * (annualInterestRate / 1200);
        
        // Display the results
        System.out.printf("The interest is %6.5f\n", interest);
    }
}
