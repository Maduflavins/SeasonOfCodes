package flavins.com.codes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] array = {10, 20, 5, 90, 45, 80, 30, 3, 35};
        System.out.println("The array is " + Arrays.toString(array));

        reverse(array);
        System.out.println("the reversed array is " + Arrays.toString(array));
    }

    private static void reverse(int[] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for(int i= 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex-i] = temp;
        }
    }
}
