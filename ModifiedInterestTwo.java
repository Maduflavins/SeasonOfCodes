//5.18 (Modified Compound-Interest Program) Modify the application in Fig. 5.6 to use only integers
//to calculate the compound interest. [Hint: Treat all monetary amounts as integral numbers
//of pennies. Then break the result into its dollars and cents portions by using the division and remainder
//operations, respectively. Insert a period between the dollars and the cents portions.]

public class ModifiedInterestTwo
{
	public static void main (String[] args)
	{
		int amount = 1;;
		int principal = 100000;
		//int rate = 5;
		double newRate;

		System.out.printf("%s%20s%n", "Year", "Amount");
		
		for (int year = 1; year <= 10; ++year)
		{
			double getPower = (double) Math.pow(1 + 0.05, year);
			double subAmount = principal * getPower;
			amount = (int) subAmount;
			int amountA = amount / 100;
			int amountB = amount % 100;

			System.out.printf("%2d%,20d.%d", year, amountA, amountB);
			System.out.println();
		}		
	}
}