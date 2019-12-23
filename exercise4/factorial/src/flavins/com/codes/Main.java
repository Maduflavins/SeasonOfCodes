package flavins.com.codes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n =6;
        int m = 1;
        int factorial = 1;
        while(m <= n){
            factorial = factorial * m;
            m++;

        }

        System.out.println(factorial);
    }
}
