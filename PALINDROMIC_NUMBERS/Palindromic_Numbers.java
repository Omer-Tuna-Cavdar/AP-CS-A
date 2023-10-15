package PALINDROMIC_NUMBERS;

import java.util.Scanner;

public class Palindromic_Numbers {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            boolean isPalindrome = checkPalindrome(input);
            System.out.println(isPalindrome ? "TRUE" : "FALSE");
        }
        scanner.close();
    }

    public static boolean checkPalindrome(String input) {
        int iterations = 0;
        while (iterations < 3) {
            int number = Integer.parseInt(input);
            int reversed = reverseNumber(number);
            int sum = number + reversed;
            if (isPalindrome(sum)) {
                input = Integer.toString(sum);
                iterations++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}    // CALISMIYOR