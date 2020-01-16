import java.util.Scanner;

public class ClassAverage1
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.println("Enter score or -1 to terminate: ");
		int grade = input.nextInt();

		int sum = 0;
		int count = 0;
		
		if (grade != -1)
		{
			sum = sum + grade;
			while (grade != -1)
			{
				System.out.println("Enter score or -1 to terminate: ");
				grade = input.nextInt();
				if (grade == -1)
				{
					sum = sum;
				}
				else
				{
					sum = sum + grade;
				}
				count++;
			}
			int average = sum / count;
			System.out.printf("Sum is %d", sum);
			System.out.printf("Average is %d", average);
		}
		else
		{
			System.out.println("Goodbye");
		}
	}
}