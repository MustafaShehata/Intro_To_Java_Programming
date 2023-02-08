/*
(Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, 
generates two integers and prompts the user to enter the sum of these 
two integers. Revise the program to generate three single-digit 
integers and prompt the user to enter the sum of these three integers.
*/
package ch_03;

// Use Scanner from java.util package
import java.util.Scanner;

public class Exercise_03_02 {
    public static void main(String[] args) {
        
        // Generate three number using method currentTimeMillis()
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
        int number3 = (int)(System.currentTimeMillis() / 5 % 10);
        
        // Create an object from Scanner Class 
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is " +
                number1 + " + " + number2 + " + " + number3 + "? ");
        // Take an input as sum of the three numbers
        int sum = input.nextInt();
        
        // Display the results
        System.out.println(number1 + " + " + number2 + " + " + number2 + " = " + 
                sum + " is " + (number1 + number2 + number3 == sum));
    }
    
    
}
