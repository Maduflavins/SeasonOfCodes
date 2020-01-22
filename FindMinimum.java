//6.23 (Find the Minimum) Write a method minimum3 that returns the smallest of three floatingpoint
//numbers. Use the Math.min method to implement minimum3. Incorporate the method into an
//application that reads three values from the user, determines the smallest value and displays the result.

import java.util.Scanner;

public class FindMinimum
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter a value: ");
		int a = input.nextInt();

		System.out.print("Enter second number: ");
		int b = input.nextInt();

		System.out.print("Enter third number: ");
		int c = input.nextInt();

		System.out.printf("The smallest value is %d", minimum3(a, b, c));
	}

	public static int minimum3(int x, int y, int z)
	{
		int response = Math.min(x, Math.min(y, z));
		return response;
	}
}