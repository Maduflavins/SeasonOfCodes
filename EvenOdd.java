//6.17 (Even or Odd) Write a method isEven that uses the remainder operator (%) to determine
//whether an integer is even. The method should take an integer argument and return true if the integer
//is even and false otherwise. Incorporate this method into an application that inputs a sequence
//of integers (one at a time) and determines whether each is even or odd.

import java.util.Scanner;

public class EvenOdd
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter a number: ");
		int n = input.nextInt();

		System.out.print(isEven(n));
	}

	public static boolean isEven(int num)
	{
		boolean response = false;
	
		if (num % 2 == 0)
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