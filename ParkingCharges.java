//6.8 (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three hours. The garage charges an additional $0.50 per hour for //each hour or part thereof in excess of three hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for longer than //24 hours at a time. Write an application that calculates and displays the parking charges for each customer who parked in the garage yesterday. You //should enter the hours parked for each customer. The program should display the charge for the current customer and should calculate and display the //running total of yesterday’s receipts. It should use the method calculateCharges to determine the charge for each customer.

import java.util.Scanner;

public class ParkingCharges
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		double totalCharges = 0;

		System.out.print("How many customers parked yesterday: ");
		int n = input.nextInt();
		System.out.println();

		for (int i = 1; i <= n; i++)
		{
			System.out.printf("Enter the number of hours for customer %d: ", i);
			int time = input.nextInt();

			System.out.printf("Charges for customer %d is %.2f%n", i, calculateCharges(time));
			totalCharges += calculateCharges(time);
		}
		System.out.printf("%nTotal charges for the period is %.2f", totalCharges);
	}

	public static double calculateCharges(int hours)
	{
		//int hours;
		double charge = 0;
		if (hours <= 3 && hours > 0)
		{
			charge = 2.00;
		}
		else if (hours > 3 && hours < 24)
		{
			int extraHours = hours - 3;
			double extraCharge = (double) extraHours * 0.50;
			charge = extraCharge + 2.00;
			if (charge >= 10)
			{
				charge = 10;
			}
		}
		else if (hours == 24)
		{
			charge = 10;
		}
		return charge;
	}
}