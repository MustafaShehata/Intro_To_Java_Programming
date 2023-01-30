package ch_02;
/*
(Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
the current time in GMT. Revise the program so it prompts the user to enter the
time zone offset to GMT and displays the time in the specified time zone.
*/

// call Scanner Class from packege java and util
import java.util.Scanner;

public class Exercise_02_08 {
    public static void main(String[] args) {
        // Create an object from class Scanner
        Scanner input = new Scanner(System.in);
        
        // Prompts the user to enter the time zone offset of GMT
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();
        
        // Get the total milliseconds since midnight, Jan 1, 1970 since unix starts
        long totalMilliSeconds = System.currentTimeMillis();
        
        // Get the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliSeconds / 1000;
        
        // Get the current seconds in the minute in the hour
        long currentSecond = totalSeconds % 60;
        
        // Get the total minutes
        long totalMinutes = totalSeconds / 60;
        
        // Get the current minutes in an hour
        long currentMinute = totalMinutes % 60;
        
        // Get the total hours
        long totalHours = totalMinutes / 60;
        
        // Get the current hour 
        long currentHour = totalHours % 24;
        // add the ofset time to the current time in your country in the GMT
        currentHour += offset;
        
        // Disapaly results differnece among times in differnet countries
        System.out.println("Current time is " + currentHour + 
                ":" + currentMinute + ":" + currentSecond);
    }
}
