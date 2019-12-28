package flavins.com.codes;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        int miniumInteger = 2147483647;
        System.out.println("Please enter number of items you intend trying out.");
        int number = scanner.nextInt();
        for(int i = 0; i<number; i++){
            System.out.println("Please enter  number " + (i + 1) + " integer");
            int checkingDigits = scanner.nextInt();
            if(checkingDigits < miniumInteger){
                miniumInteger = checkingDigits;
            }
        }
        System.out.println("the minimum integer is: " + miniumInteger);
    }
}
