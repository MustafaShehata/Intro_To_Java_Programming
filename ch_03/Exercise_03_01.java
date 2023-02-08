/*
(Algebra: solve quadratic equations) The two roots of a quadratic equation 
ax2 + bx + c = 0 can be obtained using the following formula:

    r1 = (-b + squareroot(b2 - 4ac)) / 2a   and   r2 = -b - sqaureroot(b2 - 4ac) / 2a

b2 - 4ac is called the discriminant of the quadratic equation. 
If it is positive, the equation has two real roots. 
If it is zero, the equation has one root. 
If it is negative, the equation has no real roots. 
Write a program that prompts the user to enter values 
for a, b, and c and displays the result 
based on the discriminant. If the discriminant is positive, 
display two roots. If the discriminant is 0, display one root. 
Otherwise, display “The equation has no real roots.”
Note you can use Math.pow(x, 0.5) to compute sqaureroot(x).
*/
package ch_03;

// user Scanner from java.util package
import java.util.Scanner;

public class Exercise_03_01 {
    public static void main(String[] args) {
        // Create an object from Scanner Class
        Scanner input = new Scanner(System.in);
        
        // prompt the user to enter a, b, c
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        // compute the real root of quadratic equation.
        double root1 = (-1 * b + Math.pow(b * b - 4 * a * c, 0.5)) / 2 * a;
        double root2 = (-1 * b - Math.pow(b * b - 4 * a * c, 0.5)) / 2 * a;
        double discriminant = b*b - 4*a*c;
        
        // checks if the discriminant is positive, zero, negative 
        if (discriminant > 0) {
            System.out.println("The equation has two roots " + (int)(root1*1000000.0)/1000000.0 + " and " + (int)(root2*1000000.0)/1000000.0 );
        } else {
            if (discriminant == 0)
                System.out.println("The equation has one root " + (int)(root1*1000000.0)/1000000.0 );
            else 
                System.out.println("The equation has no real roots");
        }
    }
}
