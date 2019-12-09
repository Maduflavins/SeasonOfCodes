import java.util.Scanner;
public class Carpool{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter miles per day");
		int milesPerDay = input.nextInt();
		System.out.println("Enter amount of gas per day:");
		int gasPerGallon = input.nextInt();
		System.out.println("Enter average miles per galon:");
		int averageMilesPerGallon = input.nextInt();
		System.out.println("Enter fees per day:");
		int parkingFeesPerDay = input.nextInt();
		System.out.println("Enter amount of tools per day");
		int toolsPerDay = input.nextInt();
		int costPerDayOfDriving = milesPerDay + gasPerGallon + averageMilesPerGallon + parkingFeesPerDay + toolsPerDay;
		System.out.println("your total cost per day is: " + costPerDayOfDriving);
		
	}

}
