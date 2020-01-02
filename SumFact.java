import java.util.Scanner;

public class SumFact{
	public static void main (String[] args){

		int  total = 0;
		int i = 1;

		while (i <= 5){

			int fact = 1;
			int j = 1;

			while (j <= i){

				fact = fact * j;
				j = j + 1;
			}
			total = total + fact;
			i = i + 1;
		}
		System.out.printf("Sum is %d", total);
	}
}