package flavins.com.codes;

import java.util.Scanner;
public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	        int [] myArray = getIntegers(5);
	        for(int i = 0; i < myArray.length; i++){
                System.out.println("element " + i + "typed is " + myArray[i]);
            }
        System.out.println("the average is " + getAverage(myArray));

        }



    public static int [] getIntegers(int number) {
        System.out.println("Please enter " + number + " integer values.\r");
        int [] value = new int[number];
        for(int i=0; i < value.length; i++){
            value[i] = input.nextInt();
        }
        return  value;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum+= array[i];
        }
        return (double) sum / (double) array.length;
    }

}
