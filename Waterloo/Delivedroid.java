package Waterloo;
import java.util.Scanner;
public class Delivedroid {
    public Delivedroid(int  delivered, int hiiten ){
        int points = delivered * 50 - hiiten * 10;
        if (delivered > hiiten){
        points += 500;
        }
        System.out.println("Points: " + points);
    }
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        int delivered = kbd.nextInt();
        int hiiten = kbd.nextInt();
        Delivedroid d = new Delivedroid(delivered, hiiten);
}
}