package ch_02;
/*
(Sum the digits in an integer) Write a program that reads an integer between 0
and 1000 and adds all the digits in the integer. For example, if an integer is 932,
the sum of all its digits is 14.
    Hint: Use the % operator to extract digits, and use the / operator to remove the
    extracted digit. 
    For instance, 932 % 10 = 2 and 932 / 10 = 93.
*/

import java.util.Scanner;

public class Exercise_02_06 {
    public static void main(String[] args) {
                
        // create an object from scanner
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number between 0 and 1000.
        System.out.print("Enter a number between 0 and 1000: ");
        int number = sc.nextInt();
        
        // Compute the sum of the digits in type an integer.
        int lessThan10 = number % 10; // get the last digit from right if num = 999 the last digit from right is 9
        number /= 10; // remove the last digit from right is 9 in the previous example

        int tens = number % 10; // get the last digit from the right again if num from 10 to 99 
        number /= 10; // remove the  2nd digit from right
        
        int hunderds = number % 10; // get the last digit from the right if num from 100 to 999
        number /= 10; // remove the 3rd digit from right
        
        // Compute the digits
        int sum = lessThan10 + tens + hunderds;
        
        // Display the results of the digits
        System.out.println("The sum of the digits is " + sum); // display the results
    }
}
