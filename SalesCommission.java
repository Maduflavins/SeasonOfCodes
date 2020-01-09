import java.util.Scanner;

public class SalesCommission
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		int counter = 0;
		double totalSale = 0; //all the monies made from sales
		double totalIncome = 0; //all the monies made by salesperson

		System.out.print("Enter an item figure or -1 to exit: ");
		int item = input.nextInt();

		while (item != -1)
		{
			if (item == 1)
			{
				totalSale += 239.99;
			}
			if (item == 2)
			{
				totalSale += 129.75;
			}
			if (item == 3)
			{
				totalSale += 99.95;
			}
			if (item == 4)
			{
				totalSale += 350.89;
			}

			System.out.print("Enter an item figure or -1 to exit: ");
			item = input.nextInt();

			counter++;				
		}
	
		if (counter != 0){
			System.out.printf("%nYour total Sale is: %.2f%n", totalSale);
			totalIncome = (0.09 * totalSale) + 200;
			System.out.printf("Your total income is: %.2f", totalIncome);
		}
		else {
			System.out.println("No details entered!");
		}
		
	}
}