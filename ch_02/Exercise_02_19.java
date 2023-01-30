/*
(Geometry: area of a triangle) Write a program that prompts the user to enter 
three points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays 
its area. The formula for computing the area of a triangle is
        s = (side1 + side2 + side3)/2
        area = squareroot( s*(s-side1)(s- side2)( s - side3) )
 */
package ch_02;

// Use Scanner from java.util package
import java.util.Scanner;

public class Exercise_02_19 {
    public static void main(String[] args) {        
        // Create an object from Scanner Class
        Scanner input = new Scanner(System.in);
        
        // prompt the user to enter (x1, y1), (x2, y2), and (x3, y3)
        System.out.print("Enter the coordinates of three points separated by spaces " 
                + "like x1 y1 x2 y2 x3 y3: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        
        // Compute the sides of the triangle
        double side1 = Math.pow( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 0.5);
        double side2 = Math.pow( Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2), 0.5);
        double side3 = Math.pow( Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2), 0.5);
        double s = (side1 + side2 + side3)/2;
        
        // compute the area of the rectangle
        double area = Math.pow(s*(s-side1)*(s - side2)*(s-side3), 0.5);
        
        // Display results
        System.out.printf("The area of the triangle is %4.1f\n", area);
    }
}
