
package ch_01;

/*
(Average speed in miles) Assume that a runner runs 14 kilometers in 45 minutes
and 30 seconds. Write a program that displays the average speed in miles per
hour. (Note 1 mile is equal to 1.6 kilometers.)
*/


// 1M ---> 1.6K
// ??M ---> 14K
// ?M = (1*14)/1.6

public class Exercise_01_10 {
    public static void main(String[] args) {
        
        double distance = (1*14)/1.6;
        double time = (45/60.0) + (30.0/(60*60));
        
        double averageSpeed = distance / time;
        
        System.out.println("The average speed is " + averageSpeed + "miles per hour");
        
        
    }
}
