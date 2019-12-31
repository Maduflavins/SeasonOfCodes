import java.util.Scanner;

public class SalaryCalculator
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		int counter = 1;
		
		while (counter <= 3)
		{
			System.out.print("Enter number of hours worked last week: ");
			int workTime = input.nextInt();

			System.out.print("Enter emplyee hourly rate: ");
			int hourlyRate = input.nextInt();

			double standardWorkTime = (workTime * hourlyRate);

			if (workTime <= 40)
			{
				System.out.printf("Gross wage for last week is: %.2fUSD%n", standardWorkTime);
			} 
			if (workTime > 40)
			{
				int excessWorkTime = workTime - 40;
				double extraPay = excessWorkTime * 1.5 * hourlyRate;
				double newPay = (40 * hourlyRate) + extraPay;

				System.out.printf("Gross wage for last week is: %.2fUSD%n", newPay);
			}
			counter++;
		}
	}

}