//6.28 Write a method qualityPoints that inputs a student’s average and returns 4 if it’s 90–100,
//3 if 80–89, 2 if 70–79, 1 if 60–69 and 0 if lower than 60. Incorporate the method into an application
//that reads a value from the user and displays the result.

import java.util.Scanner;

public class Average
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter your average: ");
		int gradeAverage = input.nextInt();

		System.out.println(qualityPoints(gradeAverage));
	}

	public static int qualityPoints(int number)
	{
		int average = 0;
		if (number >= 90 && number <= 100)
		{
			average = 4;
		}
		else if (number >= 80 && number < 90)
		{
			average = 3;
		}
		else if (number >= 70 && number < 80)
		{
			average = 2;
		}
		else if (number >= 60 && number < 70)
		{
			average = 1;
		}
		else
		{
			average = 0;
		}
		return average;
	}
}