import java.util.Scanner;

public class NextPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");

        int num1 = sc.nextInt(); // Read user input
        int num2 = sc.nextInt(); 
        int num3 = sc.nextInt(); 
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

        System.out.println("You entered:");
        System.out.println(num1); // Output user input
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);

        System.out.println("Next primes are:");
        System.out.println(nextPrime(num1)); // Output next prime
        System.out.println(nextPrime(num2));
        System.out.println(nextPrime(num3));
        System.out.println(nextPrime(num4));
        System.out.println(nextPrime(num5));

        sc.close();
    }

    public static int nextPrime(int n) {
        // Start from the next number
        int candidate = n + 1;
        // If it's even and not equal to 2, increment by 1 to get to an odd number
        if (candidate % 2 == 0 && candidate != 2) candidate++;

        while (!isPrime(candidate)) {
            candidate += 2; // Increment by 2 to check only odd numbers, since even numbers are not prime
        }
        return candidate; // Return the next prime number
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime numbers
        else if (n <= 3) return true; // 2 and 3 are prime numbers
        if (n % 2 == 0 || n % 3 == 0) return false; // If the number is divisible by 2 or 3, it's not prime
        int i = 5; // Start from 5, since everything below 5 is already checked exeot 4 which is even.
        while (i * i <= n) {// Check only up to the square root of the number
            if (n % i == 0 || n % (i + 2) == 0) return false;// If the number is divisible by i or i+2, it's not prime
            i += 6;// Increment by 6 to check only numbers that are not divisible by 2 or 3
        }
        return true;
    }
}
