import java.util.Scanner;

public class Fibonacci{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);

		long fibonacci = 0;
		int counter = 0;
		int a, b, sum = 0;

		System.out.print("Enter first value: ");
		a = input.nextInt();

		System.out.print("Enter second value: ");
		b = input.nextInt();

		System.out.print("Enter fibonacci number: ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++){
			sum = a + b;
			a = b;
			b = sum;
			System.out.printf("%d ", sum);
		}
		System.out.printf("Fibonacci is " + sum);
	}
}