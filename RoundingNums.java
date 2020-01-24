import java.util.Scanner;

public class RoundingNums
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter 4 (double) numbers: ");
		double x = input.nextInt();

		int a = (int) Math.floor(x + 0.9);
		double b = Math.floor(x + 10 + 0.9) / 10; //tenth roundup
		double c = Math.floor(x + 100 + 0.9) / 10; //hundredth roundup
		double d = Math.floor(x + 1000 + 0.9) / 10; //thousandth roundup
		System.out.printf("Original = %.2f and Converted integer %d%nConverted tenth %f%nConverted hundredth %f%nConverted thousandth %f%n", x, a, b, c, d);
	}
}