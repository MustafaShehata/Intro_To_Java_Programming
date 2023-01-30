package ch_02;

/*
(Physics: acceleration) Average acceleration is defined as the change of velocity
divided by the time taken to make the change, as given by the following formula:

    a = (v1 - v0) / t

Write a program that prompts the user to enter the starting velocity v0 in meters/
second, the ending velocity v1 in meters/second, and the time span t in seconds,
then displays the average acceleration.
*/

import java.util.Scanner;

public class Exercise_02_09 {
    public static void main(String[] args) {
        // Create an object sc from class scanner
        Scanner sc = new Scanner(System.in);
        
        // Display a message to the screen
        System.out.print("Enter v0, v1, and t: ");
        // Prompt the user to enter the starting velocity v0 in meters/second.
        double v0 = sc.nextDouble();
        // The ending velocity v1 in meters/second
        double v1 = sc.nextDouble();
        // and the time span t in seconds.
        double t = sc.nextDouble();
        
        // compute the average acceleration
        double a = (v1 - v0) / t;
        
        // Display the the average acceleration
        System.out.format("The average acceleration is %7.4f\n", a);   
    }
}
