/*
(Cost of driving) Write a program that prompts the user 
to enter the distance to drive, the fuel efficiency 
of the car in miles per gallon, and the price per gallon 
then displays the cost of the trip.
*/
package ch_02;

// Use Scanner from java.util package
import java.util.Scanner;

public class Exercise_02_23 {
    public static void main(String[] args) {
        // Create an object from Scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the distance to drive 
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        
        // Prompt the user to enter the fuel efficiency of the car in miles per gallon
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        
        // Prompt the user to enter the Price per gallon
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();
        
        // Compute the cost of driving
        double costOfDriving = (distance / milesPerGallon) * pricePerGallon;
        
        // Display the results
        System.out.println("The cost of driving is $" + (int)(costOfDriving * 100) / 100.0);
    }
}
