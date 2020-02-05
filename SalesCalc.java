import java.util.Scanner;

public class SalesCalc
{
	public static void main (String[] args)
	{ 
		Scanner input = new Scanner (System.in);

		int counter = 0;
		double totalSale = 0;
		double itemCost = 0;
		int itemQuantity;

		System.out.print("Enter an item figure or -1 to exit: ");
		int item = input.nextInt();

		while (item != -1)
		{
			if (item == 1)
			{
				System.out.print("Enter the quantity of item 1: ");
				itemQuantity = input.nextInt();
				itemCost = (itemQuantity * 2.98);
				totalSale += itemCost;
			}

			if (item == 2)
			{
				System.out.print("Enter the quantity of item 2: ");
				itemQuantity = input.nextInt();
				itemCost = (itemQuantity * 4.50);
				totalSale += itemCost; //itemCost is retailPrice
			}

			if (item == 2)
			{
				System.out.print("Enter the quantity of item 2: ");
				itemQuantity = input.nextInt();
				itemCost = (itemQuantity * 4.50);
				totalSale += itemCost;
			}

				System.out.print("Enter an item figure or -1 to exit: ");
				item = input.nextInt();
	
				counter++;
		}

		if (counter != 0)
		{
			System.out.printf("%nYour total Sale is: %.2f%n", totalSale);
			//totalIncome = (0.09 * totalSale) + 200;
			//System.out.printf("Your total income is: %.2f", totalIncome);
		}
		else 
		{
			System.out.println("No details entered!");
		}
	}
}