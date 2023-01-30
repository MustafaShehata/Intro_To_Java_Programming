package ch_02;

/*
(Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
    area = radius * radius * pi
    volume = area * length
*/

import java.util.Scanner; // call class Scanner for java.util

public class Exercise_02_02 {
    public static void main(String[] args) {
        
        // Create an object from class Scanner to read two varaibles from users
        Scanner input = new Scanner(System.in);
        
        // Display a massage to prompt the user to enter radius and length
        System.out.print("Enter the radius and length of a cylinder: ");
        
        // prompt user to enter radius and length
        double radius = input.nextDouble();
        double length = input.nextDouble();
        
        // constant vairaible called pi = 3.14159265359
        final double PI = 3.14159;
        
        double area = radius * radius * PI; // compute the area of the cylinder
        double volume = area * length; // compute the volume of the cylinder
                
        // display the results of area and volume
        System.out.format("The area is %7.4f\n", area);  // System.out.println("The area is " + area);
        System.out.format("The volume is %6.1f\n", volume);  // System.out.println("The volume is " + volume);
    }
}
