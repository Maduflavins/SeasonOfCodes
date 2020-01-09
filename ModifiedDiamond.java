import java.util.Scanner;

public class ModifiedDiamond
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter an odd number between 1 and 19 for diamond print: ");
		int n = input.nextInt();

		int space = n;
		//int star = 0;
		//int j;
		int spaceB = 2;

		if (n % 2 != 0 && (n > 1) && (n <= 19))
		{
			for (int c = 1; c <= n; c++)
			{
				for (int i = 1; i <= space; i++)
				{
					System.out.print(" ");
				}
				for (int j = 1; j <= ((2 * c) - 1); j++)
				{
					System.out.print("*");
				}

				space--;
				//star = star + ((2 * j) - 1);
				//star += ((2 * j) - 1);
				System.out.println();
			}

			for (int c = 1; c <= (n - 1); c++)
			{
				for (int i = 1; i <= spaceB; i++)
				{
					System.out.print(" ");
				}
				//for (int j = 1; j <= ((2 * n) - 3); j++)
				//for (int j = 1; j <= (2 * (n - c) - 1); j++)
				for (int j = 1; j <= ((2 * (n - c)) - 1); j++)
				{
					System.out.print("*");
				}

				spaceB++;
				//n--;
				System.out.println();
			}
		}
		else 
		{
			System.out.println("You have entered an invalid number!");
		}		
	}
}