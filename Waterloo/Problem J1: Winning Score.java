package Waterloo;

/**
 *  Winning Score
 */
public class  Winning Score {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
        int scoreA = (a * 3) + (b * 2) + c;
        int scoreB = (d * 3) + (e * 2) + f;
        if(scoreA > scoreB){
            System.out.println("A");
    } else if(scoreB > scoreA){
            System.out.println("B");
    } else {
            System.out.println("T");
    }
    }
}