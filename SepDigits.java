import java.util.Scanner;

public class SepDigits
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		int x;

		System.out.print("Enter a number: ");
		int value = input.nextInt();

		while (value > 0)
		{
			x = displayDigits(value);
			//System.out.printf("%d  ", x);
		}		
	}

	public static int quotient(int num)
	{
		int y = 1000;
		num = num / y;
		System.out.print(num);
		y /= 10;
		return num;
	}

	public static int remainder(int num)
	{
		int b = num  % 10;
		System.out.print(num);
		return b;
	}

	public static int displayDigits(int number)
	{	int bNew = 0;

		while (number > 0)
		{
			int aNew = quotient(number);
			bNew = remainder(aNew);

			//return remainder(aNew);
		}
		return bNew;
	}
}

	

	