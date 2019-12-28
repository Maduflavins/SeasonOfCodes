package flavins.com.codes;
import java.util.Scanner;
public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        int [] myArray = getInteger(5);
        //printArray(myArray);
        int [] sorted = sortedArray(myArray);
        printArray(sorted);
    }

    public static int [] getInteger(int number){
        System.out.println("Please enter " + number + " integer numbers.\r");
        int [] values = new int[number];
        for(int i = 0; i<values.length; i++){
            values[i] = input.nextInt();
        }
        return values;

    }
    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("The numbers in the array are " + i + " contains " + array[i]);
        }
    }

    public static int[] sortedArray(int [] array){
        int[] sorted = new int[array.length];
        for(int i = 0; i<array.length; i++){
            sorted[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i < sorted.length-1; i++){
                if(sorted[i] < sorted[i+1]){
                    temp = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sorted;

    }
}
