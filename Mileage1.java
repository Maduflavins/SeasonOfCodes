import java.util.Scanner;

public class Mileage1
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		int counter = 0;
		//int miles = 0;
		//int gallons = 0;
		int totalMiles = 0;
		int totalGallons = 0;

		System.out.print("Enter Milage of -1 to exit: ");
		int miles = input.nextInt();

		while (miles != -1)
		{
			System.out.print("Enter gallons used: ");
			int gallons = input.nextInt();
			double milesAverage = (double) miles / gallons;
			System.out.printf("Miles per gallon for this trip: %.2f%n", milesAverage);

			totalGallons += gallons;			
			totalMiles = totalMiles + miles;
			//milesAverage++;
			//System.out.printf("Total average miles per gallon thus far is: %.2f%n", milesAverage);
			
			counter += 1;

			System.out.print("Enter Milage or -1 to exit: ");
			miles = input.nextInt();

			//double milesAverage = miles / gallons;

			
		}
		
		if (counter != 0)
		{
			double milesPerGallon = (double) totalMiles / totalGallons;
			System.out.printf("%nTotal miles travelled = %d", totalMiles);
			System.out.printf("%nTotal gallons used: %d%n", totalGallons);
			System.out.printf("%nHence, average miles per gallon is: %.2f", milesPerGallon);
		}
		else
		{
			System.out.println("No data entered! Vehicle travelled no mile; no fuel used");
		}
	}

}



/*System.out.printf(%nTotal miles travelled: %d", totalMiles);
System.out.printf(%nTotal gallons used: %d", totalGallons);
System.out.printf(%nAverage Mile per Gallon: %.2f", milesPerGallons);*/