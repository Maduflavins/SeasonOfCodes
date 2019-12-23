package flavins.com.codes;
import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        int counter = 0;
        while(counter <= 2){
            System.out.println("Please enter four digit integers: ");
            int number = scanner.nextInt();
            encryptNUmber(number);
            System.out.println();
            counter++;
        }
            

        
    }

    public static void encryptNUmber(int number){
        int first = number / 1000;
        int second = (number % 1000) / 100;
        int third =  (number % 100) / 10;
        int fourth = number % 10;

        first = (first + 7) % 10;
        second = (second + 7 ) % 10;
        third = (third + 7) % 10;
        fourth = (fourth + 7) % 10;

        int swapFirst = fourth;
        int swapSecond = third;
        System.out.printf("%d%d%d%d", first, second, third, fourth);
    }

}
