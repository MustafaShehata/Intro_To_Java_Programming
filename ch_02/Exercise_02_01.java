package ch_02;

/*
(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a
double value from the console, then converts it to Fahrenheit, and displays the
result. The formula for the conversion is as follows:

    fahrenheit = (9 / 5) * celsius + 32
*/

import java.util.Scanner;

public class Exercise_02_01 {
    public static void main(String[] args) {
        
        // Create Scanner object called scan
        Scanner scan = new Scanner(System.in);
        
        // print out message to prompt the user to enter celsius degree in double value
        System.out.print("Enter a degree in Celsius: ");
        double celsius = scan.nextDouble();
        
        // formula to convert from celsius to fahrenheit
        double fahrenheit = (9 / 5.0) * celsius + 32;
        
        // print out the result of the equation
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
