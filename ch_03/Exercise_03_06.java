/*
(Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java,
to let the user enter weight, feet, and inches. 
For example, if a person is 5 feet and 10 inches, 
you will enter 5 for feet and 10 for inches.
*/
package ch_03;
import java.util.Scanner;
public class Exercise_03_06 {
    public static void main(String[] args) {
        // Create object from Scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter weight, feet, and inches
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();
        
        // Constant pound to kilograms
        final double KILOGRAMS_PER_POUND = 0.45359237;
        // Constant inch to meters
        final double METERS_PER_INCH = 0.0254;
        // Constant feet to meters
        final double METERS_PER_FEET = 0.3048; 
        
        // Convert pound to kilograms and feet and inches to meters
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = inches * METERS_PER_INCH + METERS_PER_FEET * feet;
        
        // Compute BMI 
        double bmi = weightInKilograms / Math.pow(heightInMeters, 2);
        
        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight"); 
        else if (bmi < 25)
            System.out.println("Normal"); 
        else if (bmi < 30)
            System.out.println("Overweight"); 
        else // if ( bmi >= 30)
            System.out.println("Obese");
    }
}