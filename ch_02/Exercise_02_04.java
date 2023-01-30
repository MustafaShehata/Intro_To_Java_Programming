package ch_02;
/*
(Convert pounds into kilograms) Write a program that converts pounds into kilograms.
The program prompts the user to enter a number in pounds, converts it
to kilograms, and displays the result. One pound is 0.454 kilogram.
*/

import java.util.Scanner;

public class Exercise_02_04 {
    public static void main(String[] args) {
        
        // Create an object from scanner
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user to enter a number in pounds
        System.out.print("Enter a number in pounds: ");
        double pounds = scan.nextDouble();
        
        // Constant value for kilo per pound
        final double KILOGRAM_PER_POUND = 0.454;
        
        // Convert from pound to kilo
        double kilograms = pounds * KILOGRAM_PER_POUND;
        
        // Dislpaly the results of conversion
        System.out.println( pounds + " pounds is " + kilograms + " kilograms");
    }
}
