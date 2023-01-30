package ch_02;

/*
(Population projection) Rewrite Programming Exercise 1.11 to prompt the user
to enter the number of years and display the population after the number of years.
Use the hint in Programming Exercise 1.11 for this program.
*/

import java.util.Scanner; // Import Scanner Class 

public class Exercise_02_11 {
    public static void main(String[] args) {
        
        // create an object from class scanner
        Scanner sc = new Scanner(System.in);

        // prompt the user to enter the number of years
        System.out.print("Enter the number of years: ");
        int noOfYears = sc.nextInt();

        // Details about births, deaths, and immigrants
        double birthInSeconds = 7.0;
        double deathInSeconds = 13.0;
        double immigrantInSeconds = 45.0;
        int secondsInYear = 365 * 24 * 60 * 60;
        
        // current population
        double population = 312_032_486;
        
        // births, deaths, and immigrants per year
        double birthsPerYear =  secondsInYear/birthInSeconds;
        double deathsPerYear =  secondsInYear/deathInSeconds;
        double immigrantsPerYear = secondsInYear/immigrantInSeconds;

        // compute the population projection
        population += (birthsPerYear - deathsPerYear + immigrantsPerYear) * noOfYears;

        // display the results
        System.out.println("The population in " + noOfYears + " is " + (int)population);
    }
}
