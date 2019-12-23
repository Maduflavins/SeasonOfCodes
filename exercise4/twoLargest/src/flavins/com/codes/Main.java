package flavins.com.codes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int firstLargest = 2;
        int secondLargest = 1;
        while(counter< 11){
            System.out.println("Please enter No");
            int entry = input.nextInt();
            if(entry > firstLargest){
                firstLargest = entry;
            }
            else if(entry > secondLargest){
                secondLargest = entry;
            }

            counter++;

        }
        if(firstLargest != secondLargest){
            System.out.printf("largest:%d second largest:%d",firstLargest,secondLargest);
        }else{
            System.out.printf("The numbers %d %d are equal", firstLargest, secondLargest);
        }




    }
}
