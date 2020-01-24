import java.util.Scanner;

public class GCD
{
	public static void main (String[] args)
	{
		/*int i = 1;
		int j = 1;
		int a = 24;
		int b = 30;
		int c = 1;
		int gcd = 1; 
		
		while (c <= a && c <= b)
		{
			for (i = 1; i < a; i++)
			{
				if (a % i == 0)
				{
					//System.out.print("The factors are : ");
					System.out.printf("%d ", i);
				}
			}
			System.out.println();
			for (j = 1; j < b; j++)
			{
				if (b % j == 0)
				{
					//System.out.print("The factors are : ");
					System.out.printf("%d ", j);
				}
			}
		
			if ((a % i == 0) && (b % j == 0))
			{
				gcd = (i * j);
				System.out.println(gcd);
			}
			c++;
		}*/

		Scanner input = new Scanner (System.in);

		System.out.println("COMPARE THE FACTORS OF TWO INTEGERS FOR THE GREATEST COMMON DIVISOR\n");

		System.out.print("Enter a first integer: ");
		int a = input.nextInt();

		System.out.print("Enter a first integer: ");
		int b = input.nextInt();
	
		int greatestCD = 1; 

		System.out.printf("The factors are %d and %d are: ", a, b);
	
		for (int i = 1; i < a && i < b; i++)
		{
			if ((a % i == 0) && (b % i == 0))
			{
				System.out.printf("%d ", i);
				greatestCD = i;
			}
		}
		System.out.printf("%nThe Greatest Common Divisor is %d", greatestCD);
	}
}