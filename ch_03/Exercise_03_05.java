/*
(Find future dates) Write a program that prompts the user 
to enter an integer for today’s day of the week 
(Sunday is 0, Monday is 1, . . . , and Saturday is 6). 
Also prompt the user to enter the number of days 
after today for a future day and 
display the future day of the week.
*/
package ch_03;
import java.util.Scanner;
public class Exercise_03_05 {
    public static void main(String[] args) {
        // Create object from Scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the number of current day [Today day name of the week] 
        System.out.print("Enter today's day: ");
        int numberOfDay = input.nextInt();
        
        // Prompt the user to enter the number of days after today
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = input.nextInt();
        
        
        // Create two variables of type String .. 
        String dayName = "";
        String futureDayName = "";
        
        
        switch (numberOfDay) {
            case 0: 
                dayName = "Sunday";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2: 
                dayName = "Tuesday";
                break;
            case 3: 
                dayName = "Wednesday";
                break;
            case 4: 
                dayName = "Thursday";
                break;
            case 5: 
                dayName = "Friday";
                break;
            case 6: 
                dayName = "Saturday";
                break;
        }
        
        // calculate future day
        elapsedDays = (elapsedDays+numberOfDay)%7;
        
        switch(elapsedDays){
            case 0: 
                futureDayName = "Sunday";
                break;
            case 1:
                futureDayName = "Monday";
                break;
            case 2: 
                futureDayName = "Tuesday";
                break;
            case 3: 
                futureDayName = "Wednesday";
                break;
            case 4: 
                futureDayName = "Thursday";
                break;
            case 5: 
                futureDayName = "Friday";
                break;
            case 6: 
                futureDayName = "Saturday";
                break;
        }
        
        System.out.println("Today is " + dayName + " and the future day is " + futureDayName);
    }
}
