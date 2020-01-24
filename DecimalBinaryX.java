import java.util.Scanner;

public class DecimalBinaryX
{
	public static void main (String[] args)
	{
		//Scanner input = new Scanner (System.in);

		//System.out.print("Enter a number to convert to binary: ");
		//int decimal = input.nextInt();

		System.out.print("SNo.\tBinary\tHexadecimal\tOctal\n");

		for (int i = 1; i <= 256; i++)
		{
			System.out.printf("%2d\t%4d\t%5d\t%10d%n", i, binary(i), hexa(i), octal(i));

		//System.out.println(binary(decimal));
		//System.out.println(hexa(decimal));
		//System.out.println(octal(decimal));
		}
	}

	public static int binary(int num)
	{
		String number = "";
		String result = "";
		int reverse = 0;
		while (num > 0)
			{
				int remainder = num % 2;
				number += remainder;
				num /= 2;
				number = Integer.toString(remainder);
				result = (number+""+result);
				reverse = Integer.parseInt(result);
			}
		return reverse;
	}

	public static int octal(int num)
	{	
		String number1 = "";
		String result1= "";
		int reverse1 = 0;
		while (num > 0)
		{
			int remainder1 = num % 8;
			number1 += remainder1;
			num /= 8;
			number1 = Integer.toString(remainder1);
			result1 = (number1+""+result1);
			reverse1 = Integer.parseInt(result1);
		}
		return reverse1;
	}

	public static int hexa(int num)
	{	
		String number2 = "";
		String result2= "";
		int reverse2 = 0;
		while (num > 0)
		{
			int remainder2 = num % 6;
			number2 += remainder2;
			num /= 6;
			number2 = Integer.toString(remainder2);
			result2 = (number2+""+result2);
			reverse2 = Integer.parseInt(result2);
		}
		return reverse2;
	}
}