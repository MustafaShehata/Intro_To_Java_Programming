/*
(Geometry: area of a hexagon) Write a program 
that prompts the user to enter the side of a hexagon 
and displays its area. The formula for computing 
the area of a hexagon is
    
    Area = (3 * squareroot(3) / 2) * s^2

where s is the length of a side.
*/
package ch_02;

// Import Scanner Class to take input from the user
import java.util.Scanner;

public class Exercise_02_16 {
    public static void main(String[] args) {
        // Create object from Scanner Class
        Scanner input = new Scanner(System.in);
     
        // prompt the user to take input from keyboard
        System.out.print("Enter the length of the side: ");
        double lengthOfSide = input.nextDouble();
        
        // Compute the area of a hexagon 
        double area = ((3 * Math.pow(3, 0.5)) / 2) * (lengthOfSide * lengthOfSide);
        
        // Display the results
        System.out.printf("Thr area of the hexagon is %7.4f\n", area);
    }
}
