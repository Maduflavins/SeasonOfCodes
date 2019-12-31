import java.util.Scanner;

public class Factorial{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		long factorial = 1;
		int counter = 0;	


		System.out.println("Enter a number: ");
		int n = input.nextInt();
	
		while (counter < n){
			factorial = factorial * (n - counter);
			counter++;
		}
		System.out.printf("%d! is %d", n, factorial);
	}
}

