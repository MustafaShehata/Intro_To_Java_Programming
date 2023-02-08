/*(Game: addition quiz) Listing 3.3, SubtractionQuiz.java,
randomly generates a subtraction question. Revise the program 
to randomly generate an addition question with two integers 
less than 100.
*/
package ch_03;
public class Exercise_03_10 {
    public static void main(String[] args) {
        // Generate 2 random two-digit integers
        int number1 = (int)(Math.random()*100);
        int number2 = (int)(Math.random()*100);
        
        // Prompt the user to enter answer of num1 + num2 
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        
        // Display the result
        System.out.println(number1 + " + " + number2 + " is " + 
                (number1+number2 == answer? true : 
                        "wrong. and the answer should be " + (number1 + number2)));
    }
}