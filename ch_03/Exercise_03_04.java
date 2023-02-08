/*
(Random month) Write a program that randomly generates an integer 
between 1 and 12 and displays the English month names 
January, February, . . . , December for 
the numbers 1, 2, . . . , 12, accordingly.
*/
package ch_03;
public class Exercise_03_04 {
    public static void main(String[] args) {
        // generates random integers numbres from 1 to 12
        int random = (int)(1 + Math.random()*12); // min = 1 and max = 12
        
        // declare variable to store month name iside it
        String month;
        
        // Display month name by its number
        // we can use switch case instead of if-else-if-else condition
        if (random == 1)     
            month = "January";
        else if (random == 2)
            month = "February";
        else if (random == 3) 
            month = "March";
        else if (random == 4)
            month = "April";
        else if (random == 5)
            month = "May";
        else if (random == 6)
            month = "June";
        else if (random == 7)
            month = "July";
        else if (random == 8)
            month = "August";
        else if (random == 9)
            month = "September";
        else if (random == 10)
            month = "October";
        else if (random == 11)
            month = "November";
        else // if (random == 12)
            month = "December";
        
        // Display the results
        System.out.println("The program generated: " + random + " for " + month);
    }
}
