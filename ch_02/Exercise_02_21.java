/*
(Financial application: calculate future investment value) Write a program 
that reads in investment amount, annual interest rate, and number of years 
and displays the future investment value using the following formula: 

                futureInvestmentValue =
        investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12

For example, if you enter amount 1000, annual interest rate 3.25%, 
and number of years 1, the future investment value is 1032.98.
*/
package ch_02;

// use Scanner class from java.util
import java.util.Scanner;

public class Exercise_02_21 {
    public static void main(String[] args) {
        // Create an object from Scanner Class
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter investment amount
        System.out.print("Enter investment amount: ");
        double investment = input.nextDouble();
        
        // Prompt the user enter annual interest rate in percentage
        System.out.print("Enter investment amount: ");
        double annualInterestRate = input.nextDouble();
        // compute the monthly interset rate 
        double monthlyInterestRate = annualInterestRate / 1200;
        
        // Prompt the user enter number of years
        System.out.print("Enter investment amount: ");
        int noOfYears = input.nextInt();
        
        // compute the future investment 
        double futureInvestment = investment * 
                Math.pow(1 + monthlyInterestRate, noOfYears*12);
        
        // Display the results
        System.out.printf("Future value is $%7.2f\n", futureInvestment);
    }
    
}
