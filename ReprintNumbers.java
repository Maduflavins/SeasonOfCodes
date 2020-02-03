//package is saved with lowercase-camel naming convention
import java.util.Scanner;

public class ReprintNumbers
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a 5-figure number: ");
		int num = input.nextInt();

		displayDigits(num);
	}

	public static int displayDigits(int num)
	{
		//int num;
		int div = 10000;
		//System.out.print("Enter a 5-figure number: ");
		//num = input.nextInt();
		while (num > 0)
		{
			if (quotient(num, div) != 0)
			{
				System.out.printf("%d  ", quotient(num, div));
				num = remainder(num, div);
			}
			div = div / 10;
		}
		return num;
	}

	public static int quotient(int num, int div)
	{
		return num/div;
	}
	public static int remainder(int num, int div)
	{
		return num % div;
	}		
}