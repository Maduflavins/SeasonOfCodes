import java.util.Scanner;

public class LeastValue
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		int smallest = 0;
		int i = 1;

		System.out.print("Enter number of digits: ");
		int n = input.nextInt();

		while (i <= n)
		{
			System.out.print("Enter a number: ");
			int m = input.nextInt();

			if (i == 1)
				smallest = m;
			else if (m < smallest)
				smallest = m;

			++i;

		}
		System.out.printf("The smallest number is %d%n", smallest);
	}
}