// This is a Java program that calculates the factorial of a number
import java.util.Scanner;  // Import the Scanner class for user input
public class FactorialCalculator {
    private int factorial = 1;  // Initialize factorial to 1
    public int factorial(int number) {
        // Calculate the factorial using this method
     for (int i = 1; i <= number; i++) {
            factorial *= i;  // Multiply factorial by i
        }
        return factorial;
    }
    public int maxvaluesforthisprogram() {
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter a number: ");  // Prompt the user for input
        int number = scanner.nextInt();  // Read user input
        scanner.close();  // Close the Scanner object
        System.out.println("You entered: " + number);  // Output user input
        FactorialCalculator calculator = new FactorialCalculator();
        System.out.println("The factorial of " + number + " is " + calculator.factorial(number));
        System.out.println("The maximum value for this program is " + calculator.maxvaluesforthisprogram());
    }
}