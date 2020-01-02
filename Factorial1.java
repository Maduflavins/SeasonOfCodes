import java.util.Scanner;

public class Factorial1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		long factorial = 1;
		int counter = 0;
		double exp = 0;	


		System.out.println("Enter a number: ");
		int n = input.nextInt();
	
		while (counter < n){
			factorial = factorial * (n - counter);
			//exp = exp + (1 / factorial);
			//factorial++;
			counter++;
		}
		System.out.printf("%d! is %d", n, factorial);
		//System.out.printf("%.2f is value for E", exp);
	}
}

