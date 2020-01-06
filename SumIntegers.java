Non-working, over-modified code

import java.util.Scanner;

public class SumIntegers{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
	
		int total = 0;

		for (int i = 1; i <= 10; i++)
		{
			long factorial = 1;
			int counter = 0;	


			System.out.println("Enter a number: ");
			int n = input.nextInt();
		while (counter < n){
			factorial = factorial * (n - counter);
			counter++;
		}
		System.out.printf("%d! is %d", n, factorial);
		



			total += i;
			System.out.printf("%d ", i);	
		}
		System.out.println();
		System.out.printf("The sum of the first ten numbers is " + total);
	}
}