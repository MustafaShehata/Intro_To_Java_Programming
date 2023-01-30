/*
(Geometry: distance of two points) Write a program 
that prompts the user to enter two points (x1, y1) 
and (x2, y2) and displays their distance. 
The formula for computing the distance is 

    squareroot (x2 - x1)^2 + (y2 - y1)^2. 

Note you can use Math.pow(a, 0.5) to compute 1/2*a.
*/
package ch_02;

// use Scanner to take input from the keyboard
import java.util.Scanner;

public class Exercise_02_15 {
    public static void main(String[] args) {
        // Create an object from Class Scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter x1 and y1
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        // Prompt the user to enter x2 and y2
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        // Compute the distance from (x1, y1) to (x2, y2)
        double a = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
        double distance = Math.pow(a, 0.5);
        
        // Display the results
        System.out.println("The distance between the two points is " + distance);
    }
}
