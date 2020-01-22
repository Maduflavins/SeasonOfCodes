//6.18 (Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid square (the same number of rows and columns) of asterisks //whose side is specified in integer parameter side. For example, if side is 4, the method should display

import java.util.Scanner;

public class PrintSquare
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter the number of sides of squares: ");
		int s = input.nextInt();

		squareOfAsterisks(s);
	}

	public static int squareOfAsterisks(int side)
	{
		for (int i = 1; i <= side; i++)
		{
			for (int j = 1; j <= side; j++)
			{			
				System.out.print("*");
			}
			System.out.println();
		}
		return side;
	}
}