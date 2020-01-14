import java.util.Scanner;

public class FairTax
{
	public static void main (String[] args)
	{
		int totalExpense = 0;
		int totalSalary = 0;
		int dependant = 0;
		double incomeTax = 0.0;
		double netIncome = 0.0;
		double fairTax = 0.0;
		
		
		Scanner input = new Scanner (System.in);

		System.out.println("Enter your first name followed by your last name: ");
		String firstName = input.nextLine();
		String lastName = input.nextLine();
		System.out.println("\nWelcome! " + firstName + " " + lastName);

		System.out.print("\nPlease enter your annual salary in USD: ");
		int annualSalaryA = input.nextInt();
		totalSalary += annualSalaryA;

		System.out.print("How many adults does your household have?: ");
		int adults = input.nextInt();

		switch (adults)
		{
			case 1:
				totalSalary = totalSalary;
				break;
			case 2:
				System.out.print("Enter second adult\'s first name: ");
				String adultTwoFName = input.nextLine();
				String adultTwoLName = input.nextLine();
				System.out.print("Enter annual salary in USD for " + adultTwoLName + " " + lastName +": ");
				int annualSalaryB = input.nextInt();
				totalSalary = annualSalaryA + annualSalaryB;
				break;
		}

		System.out.print("How many dependants does your household have: ");
		dependant = input.nextInt();

		switch (dependant)
		{
			case 0:
				
			case 1:
				dependant = dependant;
				break;
			case 2:
				dependant++;
				break;
			case 3:
				dependant += 2;
				break;
			default:
				System.out.println("You have more then 3 dependants!");
				dependant += 3;
				break;
		}
		

		System.out.println("\nChoose a category and enter corresponding annual expense:\nThe categories are: \n1. Housing.\n2. Feeding.\n3. Transportation.\n4. Utility and sundry.\n5. Healthcare.\n6. Vacations.\n7. Education.\n8. Investments and Savings\nPress \'ctrl\' Z to exit input mode.");

		while (input.hasNext())
		{
			int choice = input.nextInt();
			switch (choice)
			{
				case 1:
					System.out.print("Enter annual expense for Housing: ");
					int housingExpense = input.nextInt();
					totalExpense += housingExpense;
					break;
				case 2:
					System.out.print("Enter annual expense for Feeding: ");
					int feedingExpense = input.nextInt();
					totalExpense += feedingExpense ;
					break;
				case 3:
					System.out.print("Enter annual expense for Transportation: ");
					int transExpense = input.nextInt();
					totalExpense += transExpense ;
					break;
				case 4:
					System.out.print("Enter annual expense for Utility & Sundry: ");
					int utilExpense = input.nextInt();
					totalExpense += utilExpense ;
					break;
				case 5:
					System.out.print("Enter annual expense for Healthcare: ");
					int healthExpense = input.nextInt();
					totalExpense += healthExpense ;
					break;
				case 6:
					System.out.print("Enter annual expense for Vacations & Entertainment: ");
					int vacExpense = input.nextInt();
					totalExpense += vacExpense ;
					break;
				case 7:
					System.out.print("Enter annual expense for Education: ");
					int educExpense = input.nextInt();
					totalExpense += educExpense ;
					break;
				case 8:
					System.out.print("Enter annual expense for Investment and Savings: ");
					int invExpense = input.nextInt();
					totalExpense += invExpense ;
					break;
			}
			System.out.print("Choose another category: ");
		}
		System.out.printf("Total annual income for adults totalling %d = %d%n", adults, totalSalary);
		System.out.printf("Total annual expense for your household = %d%n", totalExpense);

		/*if (dependant == 0){
			netIncome = totalSalary * 1.00;
		} else if (dependant == 1){
			netIncome = totalSalary * 0.97;
		} else if (dependant == 2){
			netIncome = totalSalary * 0.95;
		} else {
			netIncome = totalSalary * 0.92;
		}*/

		switch (dependant)
		{
			case 0:
				netIncome = totalSalary * 1.00;
				break;
			case 1:
				netIncome = totalSalary * 0.97;
				break;
			case 2:
				netIncome = totalSalary * 0.95;
				break;
			default:
				netIncome = totalSalary * 0.92;
				break;
		}

		System.out.printf("Household income after considering dependants = %.2f", netIncome);		

		incomeTax = (totalExpense * 0.23);
		fairTax = (netIncome - incomeTax);

		System.out.printf("%nYour Income Tax = %.2f%n", incomeTax);
		System.out.printf("Your Fair Tax = %.2f%n", fairTax);
	}
}