
package ch_01;
/*(Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40
minutes, and 35 seconds. Write a program that displays the average speed in
kilometers per hour. (Note 1 mile is equal to 1.6 kilometers.)*/

public class Exercise_01_12 {
    public static void main(String[] args) {
        
        double distance = 24*1.6; 
        double timeInHours = 1 + (((40*60)+35)/(60*60.0));
        
        double avgSpeed = distance / timeInHours;
        
        System.out.printf("The average speed in kilometers per hour : %f\n", avgSpeed);
        
    }
}
