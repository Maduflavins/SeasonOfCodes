//write a program that collects a number of variable and prints out the smallest and largest

import java.util.Scanner;

public class SmallLarge
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		int least = 0;
		int most = 0;

		System.out.println("Enter number of items: ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++)
		{
			System.out.println("Enter number: ");
			int m = input.nextInt();

			if (i == 1)
			{
				least = m;
			}
			else if (m < least)
			{
				least = m;
			}

			if (i == 1)
			{
				most = m;
			}
			else if (m > most)
			{
				most = m;
			}
		}
		System.out.printf("The least is %d%n", least);
		//System.out.println();
		System.out.printf("The most is %d", most);
	}
}