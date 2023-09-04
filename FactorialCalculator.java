// This is a Java program that calculates the factorial of a number

import java.util.Scanner;  // Import the Scanner class for user input

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        
        System.out.print("Enter a number: ");  // Prompt the user for input
        int number = scanner.nextInt();  // Read an integer from the user
        
        int factorial = 1;  // Initialize factorial to 1
        
        // Calculate the factorial using a loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;  // Multiply factorial by i
        }
        
        System.out.println("Factorial of " + number + " is: " + factorial);  // Print the result
        
        scanner.close();  // Close the Scanner
    }
}