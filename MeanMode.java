//write an app to calculate the mean and mode of students that scored below 50

import java.util.Scanner;

public class MeanMode
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		int sum = 0;
		int count = 0;
		int counterOne = 0;

		System.out.println("Enter grade or -1 to exit: ");
		int grade = input.nextInt();

		if (grade <= 50 && grade != -1){
			sum = sum + grade;
			counterOne++;
		}

		if (grade != -1)
		{
			//sum = sum;
			while (grade != -1)
			{
				if (grade <= 50 && grade != -1)
				{
					sum = sum + grade;
					counterOne++;
				}
			/*	if (grade > 50)
				{
					if (grade == -1)
					{
					sum = sum;
					}
				}*/
				System.out.println("Enter score or -1 to exit: ");
				grade = input.nextInt();
					 
				count++;
			}
			System.out.println("The sum is " + sum);
			int ave = sum / counterOne;
			System.out.println("\nThe average is " + ave);
			System.out.println("Number of values less than 5 is " + counterOne);
		}
		else
		{
			System.out.println("No grades entered!");
		}
	}
}