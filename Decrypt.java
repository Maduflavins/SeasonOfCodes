import java.util.Scanner;

public class Decrypt{
	public static void main (String[] args){

		Scanner input = new Scanner (System.in);

		int a, b, c, d;

		System.out.print("Enter the number to decrypt: ");
		int num = input.nextInt();

		a = (((num / 100) + 3 ) % 10);
		b = ((num % 10) + 3) % 10;
		c = ((num / 1000) + 3);
		d = ((num % 100) / 10) + 3;

		/*a = ((num / 1000) + 3) % 10;
		b = (((num / 100) % 10) + 3) % 10;
		c = (((num / 10) % 10) + 3) % 10;
		d = ((num / 10) + 3) % 10;*/

		System.out.printf("a %d%n", a);
		System.out.printf("b %d%n", b);
		System.out.printf("c %d%n", c);
		System.out.printf("d %d%n", d);

		System.out.printf("Decrytped is %d%d%d%d", a, b, c, d);
	}
}