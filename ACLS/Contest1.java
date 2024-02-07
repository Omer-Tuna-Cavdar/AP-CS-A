package ACLS;
import java.util.Scanner;
public class Contest1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        int in3 = sc.nextInt();
        int in4 = sc.nextInt();
        int in5 = sc.nextInt();
        sc.close();
        int count = 0;
        int sum =0;
        int sum2 = 0;
        int checker = 0;
        int counter2 = 0;
        int counter3 = 0;
        while(in1!=0){
        in1 /= 10;
        count++;
        }
        while(in2!=0){
        sum += in2%10;
        in2 /= 10;
        }
        while(in3!=0){
        sum2 += in3%10;
        in3 /= 100;
        }
        while(in4!=0){
        checker = in4%10;
        if(checker==4){
        counter2++;
        }
        in4 /= 10;
        }
        int in5s = in5;
        while(in5s!=0){
        in5s /= 10;
        counter3++;
        }
        for(int i = 0; i<counter3; i++){
        in5/=10;
        }
        int middle = in5%10;
        System.out.println(count);
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(counter2);
        System.out.println(middle);

}
}