import java.util.Scanner;

public class Fibonacci{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);

		long fibonacci = 0;
		int counter = 0;
		int a = 1, b = 2, c = 0;

		System.out.print("Enter fibonacci number: ");
		int n = input.nextInt();

		while (counter <= n){
			c = a + b;
			counter++;
		}
		System.out.print("Fibonacci is " + c);
	}
}