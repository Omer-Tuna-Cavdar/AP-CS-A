package Clock_forloops;
public class Clock {
    public static void main(String[] args) {
            int count = 0; // \count is used to keep track of the for loop and print the correct time
            for(int i = 0; i <= 24; i++){
            if(count == 0){ // at start
                System.out.println("12:00 Midnight"); //print midnight
                count++;// increment count
            }
            else if(count<12){ // from midnigt till noon
            System.out.println(i + ":00 AM"); //print time
            count++;// increment count
            }
            else if(count == 12){// at noon
            System.out.println("12:00 Noon"); //print noon
            count++;// increment count
            }
            else if(count>12){// from noon till midnight
            System.out.println(i%12 + ":00 PM"); //print time
            count++; // increment count
            }
    }

}
}
