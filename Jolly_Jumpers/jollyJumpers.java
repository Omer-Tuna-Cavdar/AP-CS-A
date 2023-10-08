package Jolly_Jumpers;
import java.util.Scanner;

public class jollyJumpers {

    public static boolean isJolly(int[] nums) {
        int n = nums.length;

        // If the sequence has only one number, it's considered jolly
        if (n == 1) {
            return true;
        }

        boolean[] differences = new boolean[n];

        for (int i = 1; i < n; i++) {
            int diff = Math.abs(nums[i] - nums[i - 1]);
            // calculate the absulete value of difference between every possible pair of numbers
            
            // The difference should be between 1 and n-1
            if (diff == 0 || diff >= n) {
                return false;
            }

            // If we've seen this difference before, it's not jolly
            if (differences[diff]) {
                return false;
            }

            differences[diff] = true;
        }

        // Ensure all differences from 1 to n-1 are present
        for (int i = 1; i < n; i++) {
            if (!differences[i]) {
                return false;
            }
        }

        return true;// if every condition is met, the sequence is jolly
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt(); // Read user input

        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt(); // Read user input
        }

        if (isJolly(nums)) { // Check if the sequence is jolly
            System.out.println("The sequence is a jolly jumper."); // Output the result
        } else { // if not
            System.out.println("The sequence is not a jolly jumper.");// Output the result
        }

        scanner.close();
    }
}
