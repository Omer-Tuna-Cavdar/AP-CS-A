public class Static_Variables_Example {
   static class Counter {
    // Static variable to hold the count
    static int count = 0;

    // Function to increment and display the count
    static void incrementAndPrint() {
        count++; // Increment the static count variable
        System.out.println("Count: " + count);
    }
}
    public static void main (String[] args) {
        Counter.incrementAndPrint(); // Output: Count: 1
        Counter.incrementAndPrint(); // Output: Count: 2
        Counter.incrementAndPrint(); // Output: Count: 3
    }
}
