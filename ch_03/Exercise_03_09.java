/*
(Business: check ISBN-10) An ISBN-10 (International Standard Book Number) 
consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a 
checksum, which is calculated from the other 9 digits using the following formula:
(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
If the checksum is 10, 
the last digit is denoted as X according to the ISBN-10 convention. 
Write a program that prompts the user to enter the first 9 digits and 
displays the 10-digit ISBN (including leading zeros). 
Your program should read the input as an integer
*/
package ch_03;
import java.util.Scanner;
public class Exercise_03_09 {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt the user
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();
        
        // 013601267
        int d1 = isbn / 100000000;
        int remainderDigits = isbn % 100000000;
        int d2 = remainderDigits / 10000000;
        remainderDigits %= 10000000;
        int d3 = remainderDigits / 1000000;
        remainderDigits %= 1000000;
        int d4 = remainderDigits / 100000;
        remainderDigits %= 100000;
        int d5 = remainderDigits / 10000;
        remainderDigits %= 10000;
        int d6 = remainderDigits / 1000;
        remainderDigits %= 1000;
        int d7 = remainderDigits / 100;
        remainderDigits %= 100;
        int d8 = remainderDigits / 10;
        remainderDigits %= 10;
        int d9 = remainderDigits;
        
        // Compute ISBN-10
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 
                + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        
        // Display the results 
        System.out.println("The ISBN-10 number is " + d1 
                + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + (d10 == 10? "X" : d10));
    }
}
