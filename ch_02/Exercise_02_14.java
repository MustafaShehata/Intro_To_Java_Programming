package ch_02;

/*
(Health application: computing BMI) Body Mass Index (BMI) 
is a measure of health on weight. It can be calculated by taking your weight 
in kilograms and dividing, by the square of your height in meters. 
Write a program that prompts the user to enter a weight in pounds 
and height in inches and displays the BMI. Note one pound is 0.45359237 kilograms 
and one inch is 0.0254 meters. 
*/

// Import Scanner Class from java.util package
import java.util.Scanner;

public class Exercise_02_14 {
    public static void main(String[] args) {
        // Create an object from Scanner class
        Scanner sc = new Scanner(System.in);
        
        // prompt the user to enter weight and height
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double heightInInches = sc.nextInt();
        
        // 1 pound             -->  0.45359237 kilograms
        // 95.5 pound (giving) -->    ? (kilograms) 
        // ?(kilograms) = 95.5*0.45359237
        // pounds to kilograms 
        final double KILOGRASMS_PER_POUND = 0.45359237;
        double weightInKilograms = weightInPounds * KILOGRASMS_PER_POUND;
        
        // 1 inch           -->  0.0254 (meter)
        // 50 inch (giving) -->  ? (meter)
        // ?(meter) = 50*0.0254
        // meters to inches
        final double METER_PER_INCH = 0.0254;
        double heightInMteters = heightInInches * METER_PER_INCH;
        
        // Compute the equation to get BMI
        double bodyMassIndex = weightInKilograms / (heightInMteters * heightInMteters);
        
        // Diplay the results 
        System.out.printf("BMI is %7.4f\n", bodyMassIndex);
    }
}
