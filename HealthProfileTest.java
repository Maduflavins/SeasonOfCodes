import java.util.Scanner;

public class HealthProfileTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String firstName = input.nextLine();

		System.out.println("Please enter your last name: ");
		String lastName = input.nextLine();

		System.out.println("Gender. Select 1 for Male and 2 for Female: ");
		int gender = input.nextInt();

		System.out.println("Now enter you month of birth: ");
		int month = input.nextInt();
	
		System.out.println("...your day of birth: ");
		int day = input.nextInt();

		System.out.println("and your year of birth: ");
		int year = input.nextInt();

		System.out.println("Please provide your height (in inches): ");
		double height = input.nextDouble();

		System.out.println("...and your weight (in pounds): ");
		double weight = input.nextDouble();

		HealthProfile person = new HealthProfile(firstName, lastName, gender, month, day, year, height, weight);

		System.out.println();

		System.out.printf("Welcome, %s %s!%nYour birthday is %d/%d/%d%n", person.getFirstName(), person.getLastName(), person.getMonth(), person.getDay(), person.getYear());
		System.out.printf("You are %d years old%n", person.calculateAge(year));
		System.out.print("You indicated you are a ");
		person.obtainGender(gender);
		System.out.println();
		System.out.printf("Your Maximum Heart Rate is %d bpm%n", person.getMaxHeartRate(year));
		System.out.printf("Your Target Heart Rate is between %.2f percent and %.2f percent%n", person.targetHeartRateA(year), person.targetHeartRateB(year));
		System.out.printf("Your Body Mass Index (BMI) is %.2f bpm%n", person.getBodyMassIndex(height, weight));
		if (person.getBodyMassIndex(height, weight) < 18.5){
			System.out.println("You may be a bit Underweight. Please eat better and rest much better.");
		}
		if (18.5 < person.getBodyMassIndex(height, weight) && person.getBodyMassIndex(height, weight) < 24.9){
			System.out.println("You have a seemingly normal weight. Keep up the good work");
		}
		if (24.9 < person.getBodyMassIndex(height, weight) && person.getBodyMassIndex(height, weight) < 29.9){
			System.out.println("You appear to be overweight. Consider losing some weight.");
		}
		if (person.getBodyMassIndex(height, weight) >= 30){
			System.out.println("You are obese. You urgently need to shed an appreciable amount of weight");
		}
	}
}