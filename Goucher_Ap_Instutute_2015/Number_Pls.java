package Goucher_Ap_Instutute_2015;
import java.util.Scanner;
public class Number_Pls {

public static void main(String[] args) {
    int [][] arr1 = 
    {{2,4,5,6,1,8,9,1,4,5},
    {3,5,7,9,10,3,2,5,6,7},
    {6,4,4,5,10,8,5,6,7,8},
    {4,7,7,9,3,2,7,14,9,0},
    {5,6,8,8,8,7,7,5,5,7},
    {6,5,4,6,4,1,3,6,8,7},
    {8,8,3,7,8,4,4,4,6,3},
    {10,8,16,7,3,7,8,25,9,2},
    {4,8,3,8,2,4,6,7,10,4},
    {4,3,6,8,1,4,3,7,3,4}};
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a x1: ");
    int x1 = scan.nextInt()-1;
    System.out.println("Enter a y1: ");
    int y1 = scan.nextInt()-1;
    System.out.println("Enter a x2: ");
    int x2 = scan.nextInt()-1;
    System.out.println("Enter a y2: ");
    int y2 = scan.nextInt()-1;
    scan.close();
    int sum = 0;
    int grearterx = Math.max(x1, x2);
    int lessx = Math.min(x1, x2);
    int greattery = Math.max(y1, y2);
    int lessy = Math.min(y1, y2);
    
    for(int i = lessx; i <= grearterx; i++){
        for(int j = lessy; j <= greattery; j++){
            sum += arr1[i][j];
        }
    }
    System.out.println(sum);
    
    


}

}