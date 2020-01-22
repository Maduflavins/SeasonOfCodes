//6.24 (Perfect Numbers) An integer number is said to be a perfect number if its factors, including
//1 (but not the number itself), sum to the number. For example, 6 is a perfect number, because 6 =
//1 + 2 + 3. Write a method isPerfect that determines whether parameter number is a perfect number.
//Use this method in an application that displays all the perfect numbers between 1 and 1000. Display
//the factors of each perfect number to confirm that the number is indeed perfect. Challenge the computing
//power of your computer by testing numbers much larger than 1000. Display the results.

import java.util.Scanner;

public class PerfectNumbers
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		//System.out.print("Enter a possible perfect number: ");
		//int number = input.nextInt();

		//System.out.println("Number\t Factors");
	
		for (int j = 1; j <= 1000; j++)
		{
			System.out.println(isPerfect(j));
		}		
	}

	public static int isPerfect(int num)
	{
		int sum = 0;
		boolean status = false;
		for (int i = 2; i <= num; i++)
		{
			//System.out.printf("%3d\t1, ", i);
			switch(num % i)
			{
				case 0:
					if (i < num)
					{
						sum += i;
						//System.out.printf("%d is a multiple of %d%n", i, num);
						//System.out.printf("%d, ", i);
						break;
					}
					else if (i == num)
					{
						sum = sum;
					}
				default:
					sum = sum;
					break;			
			}
		}
		//System.out.print(num);
		if ((sum + 1) == num)
		{
			System.out.printf("%n%d is a perfect number.%n", num);
		}
		//else
		//{
		//	System.out.printf("%n%d is not a perfect number.%n", num);
		//}
		
		//System.out.println();
		return (sum + 1);

		
	}
}