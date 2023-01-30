package ch_02;
/*
(Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the maximum number of years and remaining
days for the minutes. For simplicity, assume that a year has 365 days.
*/

// import Scanner Class from the util package from java package
import java.util.Scanner;

public class Exercise_02_07 {
    // Main method that program starts execution from it 
    public static void main(String[] args) {
        // Create an object of class Scanner
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the minutes
        System.out.print("Enter the number of minutes: ");
        int minutes = sc.nextInt();
        
        // convert minutes to years and days
        int years = minutes / ( 365*24*60 ); // minutes in days = 360*24*60 = 525600
        int days = ( minutes % (365*24*60) ) / ( 24*60 ); // minutes in days = 24*60 = 1440 
        
        // Dispaly the results of years and days
        System.out.println(minutes + " minutes is approximately " + 
                years + " years and " + days + " days");
    }
}
