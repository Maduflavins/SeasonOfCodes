//(Exponentiation) Write a method integerPower(base, exponent) that returns the value of
//base exponent. For example, integerPower(3, 4) calculates 34 (or 3 * 3 * 3 * 3). Assume that exponent is a positive,
//nonzero integer and that base is an integer. Use a for or while statement to control the calculation.
//Do not use any Math class methods. Incorporate this method into an application that reads
//integer values for base and exponent and performs the calculation with the integerPower method.

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
		
		int output = 1;

		for (int i = 1; i <= e; i++)
		{
			output = integerPower(b, e);
			//System.out.printf("At %d iteration answer is %d%n", i, output);
		}
		System.out.printf("%d raised to power %d is %d%n", b, e, output);
	}

	public static int integerPower(int base, int exponent)
	{
		int result = 1;
		for (int j = 1; j <= exponent; j++)
		{
			result = result * base;
		}
		return result;
	}
}