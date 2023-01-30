package ch_02;

/*
(Physics: finding runway length) Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:

length = v^2 / 2*a

Write a program that prompts the user to enter v in meters/second (m/s) and
the acceleration a in meters/second squared (m/s2), then, displays the minimum
runway length.
*/

import java.util.Scanner;

public class Exercise_02_12 {
    public static void main(String[] args) {
        // create an object from scanner
        Scanner sc = new Scanner(System.in);
        
        // prompt the user to enter v and a;
        System.out.print("Enter speed and acceleration: ");
        int v = sc.nextInt();
        double a = sc.nextDouble();
        
        // compute the minimum runway length
        double length = v * v / (2 * a);
        
        // Dispaly the results of the length
        System.out.format("The minimum runway length for this airplane is %6.3f\n", 
                length);
    }
}
