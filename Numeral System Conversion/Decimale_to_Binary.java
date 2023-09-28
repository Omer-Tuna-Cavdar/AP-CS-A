import java.util.Scanner;

public class Decimale_to_Binary {
    public static void main(String[] args) {
        int decimalNumber;
        System.out.println("Enter a decimal number:");
        Scanner scanner = new Scanner(System.in);
        decimalNumber = scanner.nextInt();
        scanner.close();

        int binaryNumber = convertDecimalToBinary(decimalNumber);
        System.out.println("Binary: " + binaryNumber);
    }

    public static int convertDecimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return 0; // Special case for input 0
        }

        int binary = 0;
        int base = 1;

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary += remainder * base;
            decimalNumber = decimalNumber / 2;
            base *= 10;
        }

        return binary;
    }
}
