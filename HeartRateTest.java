import java.util.Scanner;

public class HeartRateTest{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your first name: ");
		String firstName = input.nextLine();

		System.out.println("Please enter your last name: ");
		String lastName = input.nextLine();

		System.out.println("Please enter your month of birth: ");
		int month = input.nextInt();

		System.out.println("Enter your day of birth: ");
		int day = input.nextInt();

		System.out.println("Enter your year of birth: ");
		int year = input.nextInt();
		
		HeartRate person1 = new HeartRate(firstName, lastName, month, day, year);


		System.out.println();		

		//person1.setFirstName(firstName);
		System.out.printf("Welcome, %s %s!%nYour birthday is %d/%d/%d%n", person1.getFirstName(), person1.getLastName(), person1.getMonth(), person1.getDay(), person1.getYear());
		System.out.printf("You are %d years old%n", person1.calculateAge(year));
		System.out.printf("Your maximum heart rate is %d bpm%n", person1.MaximumHeartRate(year));
		System.out.printf("Your target heart rate is between %.2f and %.2f percent", person1.targetHeartRateA(year), person1.targetHeartRateB(year));
	}
}