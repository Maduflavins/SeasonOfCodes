/*
5.14 (Modified Compound-Interest Program) Modify the compound-interest application of Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to vary the interest rate.
*/

public class ModifiedInterest
{
	public static void main (String[] args)
	{
		
		double amount;
		double principal = 1000.0;
		//double rate = 0.05;

		System.out.printf("%s%20s%24s%n", "Year", "Rate", "Deposit Amount");

		for (int year = 1; year <= 10; ++year)
		{
			for (int r = 5; r <= 10; r++)
			{

				double rate = (double) r / 100;
				amount = principal * Math.pow(1.0 + rate, year);	
				System.out.printf("%2d%,22.2f%,20.2f%n", year, rate, amount);
			}
		}
	}
}