package Multiples;
import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// scan is the scanner
        System.out.println("Enter first number of first pair:");
        int firstfirst = scan.nextInt(); // firstfirst is the first number of the first pair
        System.out.println("Enter second number of first pair:");
        int firstsecond = scan.nextInt(); // firstsecond is the second number of the first pair
        System.out.println("Enter first number of second pair:");
        int secondfirst = scan.nextInt(); // secondfirst is the first number of the second pair
        System.out.println("Enter second number of second pair:");
        int secondsecond = scan.nextInt();  // secondsecond is the second number of the second pair
        System.out.println("Enter Range:"); 
        int range = scan.nextInt(); // range is the range of the numbers that the code will work for
        int sum1 = 0; // sum1 is the sum of the  numbers in range which is divisible by firstfirst or firstsecond
        int sum2 = 0;// sum2 is the sum of the  numbers in range which is divisible by secondfirst or secondsecond
        int result = 0;// result is the difference between sum1 and sum2 in absolute value
        scan.close(); // close the scanner
        for(int i=0; i<range; i++){//this for loop checks every number in range
            if(i%firstfirst==0 ||i %firstsecond==0){//this checks if the number is divisible by firstfirst or firstsecond
                sum1+=i;//this adds the number to sum1
            }
            if(i%secondfirst==0||i%secondsecond==0){//this checks if the number is divisible by secondfirst or secondsecond
                sum2+=i;//this adds the number to sum2
            }
        }
        result= Math.abs(sum1-sum2);//this calculates the difference between sum1 and sum2 in absolute value
        System.out.println("Multiple total:" + firstfirst + " and " + firstsecond + " is " + sum1 +  " Range " + range);//this prints the sum of the numbers in range which is divisible by firstfirst or firstsecond
        System.out.println("Multiple total:" + secondfirst + " and " + secondsecond + " is " + sum2 +  " Range " + range);//this prints the sum of the numbers in range which is divisible by secondfirst or secondsecond
        System.out.println("Difference between two totals is " + result);//this prints the difference between sum1 and sum2 in absolute value
    }
    
}
