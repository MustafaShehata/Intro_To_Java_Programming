/*
(Sort three intergers) Write a program that prompts the user to enter three intergers
and display the integers in non-decreasing order.
*/
package ch_03;
import java.util.Scanner;
public class Exercise_03_08 {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        
        // introduction
        System.out.println("This program will take in three integers "
                + "and sort them from least to greatest.");
        
        // prompt the user to enter three numbers
        System.out.print("Enter three integers sseperated by spaces: ");
        int number1 = input.nextInt(); // 55
        int number2 = input.nextInt(); // 66
        int number3 = input.nextInt(); // 11
        
        // sort three numbers in ascending order 
        // sort num1 = 55 and num2 = 66
        //   (55 > 66)  // false
        if (number1 > number2) {
             int temp = number1;
             number1 = number2;
             number2 = temp; 
        }
        //                 n1 n2 n3
        // current output: 55 66 11
        
        
        // sort num2 = 55 and num3 = 11
        //  (66 > 11) true
        if (number2 > number3) { // swap num2:66 with num3:11 
                int temp = number2; // temp = 66
                number2 = number3; // num2 = 11
                number3 = temp; // num3 = 66
        }
        //                 n1 n2 n3
        // current output: 55 11 66
        
        
        // sort num1 = 55 and num2 = 11
        //     (66 > 11) 
        if (number1 > number2) { // swap num1:66 with num2:11 
             int temp = number1; // temp = 55
             number1 = number2; // num1 = 11
             number2 = temp; // num2 = 55
        }
        //                 n1 n2 n3
        // current output: 11 55 66 
        

        // Display the results in ascending order from least to greatest
        System.out.print("Sorting number in ascending order: ");
        System.out.println(number1 + " " +number2 + " " +number3);
    }
}
