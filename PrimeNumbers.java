import java.util.Scanner;

public class PrimeNumbers
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.println("Prime numbers between 1 and 1000 are: ");

		for (int num = 1; num <= 1000; num++)
		{
			if (num / 1 == num && num / num == 1)
			{
				if (num >= 4 && (num % 2 == 0 || num % 3 == 0))
				{
					System.out.printf("%d is not prime%n", num);
				}
					else if (num > 5 && num % 5 == 0)
				{
					System.out.printf("%d is not prime%n", num);
				}
					else if (num > 7 && num % 7 == 0)
				{
					System.out.printf("%d is not prime%n", num);
				}
				else
				{
					System.out.printf("%d is prime%n", num);
					//System.outf.println(num);
				}
			}
		}
	}
}