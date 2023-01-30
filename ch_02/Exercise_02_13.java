package ch_02;
/*
(Financial application: compound value) Suppose you save $100 each month into
a savings account with an annual interest rate of 5%. Thus, the monthly interest
rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
    100 * (1 + 0.00417) = 100.417
    
    After the second month, the value in the account becomes
    (100 + 100.417) * (1 + 0.00417) = 201.252
    
    After the third month, the value in the account becomes
    (100 + 201.252) * (1 + 0.00417) = 302.507
    
and so on.

Write a program that prompts the user to enter a monthly saving amount and displays
the account value after the sixth month.
*/

import java.util.Scanner;

public class Exercise_02_13 {
    public static void main(String[] args) {
        
        // create an object to take input from user like scanf() in C language
        Scanner input = new Scanner(System.in);
        
        // constant annual interest rate / 12 to get monthly interest rate
        final double MONTHLY_INTEREST_RATE  = (0.05)/12;
        
        // prompt the user to enter a monthly saving amount
        System.out.print("Enter the monthly saving amount: ");
        int monthlySavingAmount = input.nextInt();
        
        // first month
        double totalSavings = monthlySavingAmount * (1 + MONTHLY_INTEREST_RATE);
        
        // second month
        totalSavings = (monthlySavingAmount + totalSavings ) * (1 + MONTHLY_INTEREST_RATE);   
        
        // third month
        totalSavings = (monthlySavingAmount + totalSavings) * (1 + MONTHLY_INTEREST_RATE);   
        
        // forth month
        totalSavings = (monthlySavingAmount + totalSavings) * (1 + MONTHLY_INTEREST_RATE);
        
        // fifth month
        totalSavings = (monthlySavingAmount + totalSavings) * (1 + MONTHLY_INTEREST_RATE);
        
        // sixth month
        totalSavings = (monthlySavingAmount + totalSavings) * (1 + MONTHLY_INTEREST_RATE);
        
        // dispaly the results 
        System.out.printf("After the sixth month, the account value is $%6.2f\n", 
                totalSavings);
    }
}