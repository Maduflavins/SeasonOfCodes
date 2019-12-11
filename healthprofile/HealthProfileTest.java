import java.util.Scanner;
public class HealthProfileTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		HealthProfile healthprofile = new HealthProfile("default", "default", "default", 1, 2, 1998, 12.0, 12.8);
		System.out.println("Please enter Your first Name: ");
		String fname = input.nextLine();
		healthprofile.setFirstName(fname);
		String lname = input.nextLine();
		healthprofile.setLastName(lname);
		System.out.println("Please enter your month of birth: ");
		int month = input.nextInt();
		healthprofile.setMonth(month);
		System.out.println("Please enter your day of birth: ");
		int day = input.nextInt();
		healthprofile.setDay(day);
		System.out.println("Please enter year of birth: ");
		int year = input.nextInt();
		healthprofile.setYear(year);
		System.out.println("Hi " + healthprofile.getFirstName() + " " + healthprofile.getLastName());
		healthprofile.displayBirthDate();
		System.out.println();
		System.out.printf("BMI: %.2f Max Heart Rate: %.2f", healthprofile.calBMI(), healthprofile.calMaxHeartRate());
		
		System.out.printf("Minimum Heart Target: %.2f Maximum Heart Target: %.2f", healthprofile.minTarget(), healthprofile.maxTarget());
		
		
	}
}
