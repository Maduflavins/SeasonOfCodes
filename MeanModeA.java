//write an app to calculate the mean and mode of students that scored below 50

import java.util.Scanner;

public class MeanModeA
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		int sum = 0;
		int count = 0;
		int counterOne = 0;

		System.out.print("Enter grade or -1 to exit: ");
		int grade = input.nextInt();

		if (grade != -1)
		{
			if (grade <= 50)
			{
				sum += grade;
				counterOne++;
			}
			while (grade != -1)
			{
				System.out.print("Enter score or -1 to exit: ");
				grade = input.nextInt();

				if (grade == -1)
				{
					sum = sum;
				}
				else
					if (grade <= 50)
					{
						sum = sum + grade;
						counterOne++;
					}
				{
					
				}
				count++;
			}
			
			int average = sum / counterOne;
			System.out.println("Sum of value less than 51 = " + sum);
			System.out.println("Values less than 51 = " + counterOne);
			System.out.println("Average of the values = " + average);		
		}
		else
		{
			System.out.println("No grades entered!");
		}
	}
}

