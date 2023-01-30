package ch_02;

/*

(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter.

*/

import java.util.Scanner;


public class Exercise_02_03 {
    public static void main(String[] args) {
        
        // Create an object from class Scanner 
        Scanner scan = new Scanner(System.in);
        
        // Prompt user to enter feet value
        System.out.print("Enter a value for feet: ");
        double feet = scan.nextDouble();
        
        // Constant conversion value
        final double METER_PER_FOOT = 0.305;
        
        // Convert feet to meters
        double meters = feet * METER_PER_FOOT;
        
        // Display the result of conversion
        System.out.println(feet + " feet is " + meters + " meters");
    }
}
