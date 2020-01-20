//6.16 (Multiples) Write a method isMultiple that determines, for a pair of integers, whether the
//second integer is a multiple of the first. The method should take two integer arguments and return
//true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.]
//Incorporate this method into an application that inputs a series of pairs of integers (one pair at a
//time) and determines whether the second value in each pair is a multiple of the first.

import java.util.Scanner;

public class PrimeCheck
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter a numerator: ");
		int num = input.nextInt();

		System.out.print("Enter a denomenator: ");
		int denom = input.nextInt();
		
		System.out.print(isMultiple(num, denom));
		System.out.printf("%3d is not a multiple of %d", denom, num);
	}

	public static boolean isMultiple(int a, int b)
	{
		boolean response = false;

		if (a % b == 0)
		{
			response = true;
		}
		else
		{
			response = false;
		}
		return response;
	}
}