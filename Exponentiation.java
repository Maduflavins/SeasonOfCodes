import java.util.Scanner;

public class Exponentiation
{
	public static void main(String[] args)
	{	
		Scanner input = new Scanner (System.in);

		System.out.print("Enter the base: ");
		int b = input.nextInt();

		System.out.print("Enter the power: ");
		int e = input.nextInt();
	
		integerPower(b, e);
	}

	public static void integerPower(int b, int e)
	{
		int result = 1;
		for (int j = 1; j <= e; j++)
		{
			result *= b;
		}
		System.out.printf("Answer is: %d", result);
	}
}