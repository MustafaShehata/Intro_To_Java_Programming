package ch_02;

/*

(Science: calculating energy) Write a program that calculates the energy needed
to heat water from an initial temperature to a final temperature. Your program
should prompt the user to enter the amount of water in kilograms and the initial
and final temperatures of the water. The formula to compute the energy is

Q = M * (finalTemperature – initialTemperature) * 4184

where M is the weight of water in kilograms, initial and final temperatures are in
degrees Celsius, and energy Q is measured in joules.

*/



import java.util.Scanner;

public class Exercise_02_10 {
    public static void main(String[] args) {
        
        // create an object from class scanner
        Scanner sc = new Scanner(System.in);
        
        // prompt the user to enter amount of water in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double m = sc.nextDouble();
        
        // prompt the user to enter the initial temperature
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = sc.nextDouble();
        
        // prompt the user to enter the initial temperature
        System.out.print("Enter the final temprature: ");
        double finalTemperature = sc.nextDouble();
        
        // calculate the energy to heat water
        double q = m * (finalTemperature - initialTemperature) * 4184;
        
        // display the energy of water needed to heat water
        System.out.println("The energy needed is " + q);
        
        
    }
}
