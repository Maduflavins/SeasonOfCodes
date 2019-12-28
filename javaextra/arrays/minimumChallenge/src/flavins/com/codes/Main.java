package flavins.com.codes;
import java.util.Scanner;

public class Main {

    private static Scanner imput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter count:");
        int count = imput.nextInt();
        imput.nextLine();
	    int [] myArray = readIntegers(count);

       printArray(myArray);
        System.out.println("the minumn number in the array is: " + findMinimum(myArray));
    }

    public static int[] readIntegers(int count){
        System.out.println("Plsase enter " + count + " numbers ");
        int[] values = new int[count];

        for(int i = 0; i < values.length; i++){
            int counter = i + 1;
            System.out.println("Please enter  number for " + i + " index");
            values[i] = imput.nextInt();


        }
        return values;

    }

    public static int findMinimum(int[] array){
        int minimum = 2_147_483_647;
        for(int i=0; i < array.length; i++){
            if(array[i] < minimum){
                minimum = array[i];
            }

        }
        return minimum;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("index " + i + "  in the array is " + array[i]);
        }
    }
}
