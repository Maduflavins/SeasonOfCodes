import java.util.Scanner;

public class Allops{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);

		System.out.println("Type in a number: ");
		int a = input.nextInt();

		System.out.println("Type in a second number: ");
		int b = input.nextInt();

		//System.out.println("Now type in a final number: ");
		//int c = input.nextInt();

		int w = a + b;
		int x = a * b;
		int y = a - b;
		int z = a / b;
		int q = a % b;

		System.out.printf("Sum is: %d%nProduct is: %d%nDifference is: %d%nQuotient is: %d%nRemainder is: %d%n", w, x, y, z, q);

	}
}
