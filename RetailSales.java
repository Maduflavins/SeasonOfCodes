import java.util.Scanner;

public class RetailSales
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		int counter = 0;
		int oneCount = 0;
		int twoCount = 0;
		int threeCount = 0;
		int fourCount = 0;
		int fiveCount = 0;
		double totalSale = 0;
		double itemQuantity = 0;
		double itemCost;


		System.out.print("Enter an item figure or -1 to exit: ");
		int item = input.nextInt();

		while (item != -1)
		{
			switch (item)
			{
				case 1:
					System.out.print("Enter the quantity of item 1: ");
					itemQuantity = input.nextInt();
					itemCost = (itemQuantity * 2.98);
					totalSale += itemCost;
					break;
				case 2:
					System.out.print("Enter the quantity of item 2: ");
					itemQuantity = input.nextInt();
					itemCost = (itemQuantity * 4.50);
					totalSale += itemCost;
					break;
				case 3:
					System.out.print("Enter the quantity of item 3: ");
					itemQuantity = input.nextInt();
					itemCost = (itemQuantity * 9.98);
					totalSale += itemCost;
					break;
				case 4:
					System.out.print("Enter the quantity of item 4: ");
					itemQuantity = input.nextInt();
					itemCost = (itemQuantity * 4.49);
					totalSale += itemCost;
					break;
				default:
					System.out.print("Enter the quantity of item 5: ");
					itemQuantity = input.nextInt();
					itemCost = (itemQuantity * 6.87);
					totalSale += itemCost;
					break;
			}
			counter++;

			System.out.print("Enter an item figure or -1 to exit: ");
			item = input.nextInt();
		}

		if (counter != 0)
		{
			System.out.printf("%nYour total Sale is: %.2f%n", totalSale);
		}
		else 
		{
			System.out.println("No details entered!");
		}
	}
}