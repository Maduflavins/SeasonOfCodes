import java.util.Scanner;

public class CreditCalculator
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		int balance = 0;
		int counter = 0;
		int charges = 0;
		int appliedCredit = 0;
		int creditLimit = 0;
		int newBalance = 0;

		System.out.print("Enter your account number or -1 to exit: ");
		int accountNumber = input.nextInt();

		while (accountNumber != -1)
		{
			System.out.printf("Calculation for customer with account number: %d%n", accountNumber);
			
			System.out.print("Enter beginning balance: ");
			balance = input.nextInt();

			System.out.print("Enter total charge: ");
			charges = input.nextInt();

			System.out.print("Enter Credit Score: ");
			appliedCredit = input.nextInt();

			System.out.print("Enter Credit Limit: ");
			creditLimit = input.nextInt();

			newBalance = balance + charges - appliedCredit;
			if (newBalance > creditLimit)
			{
				System.out.println("Credit limit exceeded");
			}
			else 
			{
				System.out.println("Credit within limit!");
			}
			
			counter++;

			System.out.print("Enter your account number or -1 to exit: ");
			accountNumber = input.nextInt();	
		}
		
		if (counter != 0)
		{
			System.out.println("Done!");
		}
		else
		{
			System.out.println("No account info entered!");
		}
	}
}
