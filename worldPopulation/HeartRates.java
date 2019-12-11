import java.util.Scanner;
public class HeartRates{
	public static void main(String[] args){
		HeartTest heartRates = new HeartTest();
		Scanner input = new Scanner(System.in);
		System.out.println("Hello Please enter your first Name: ");
		String firstName = input.nextLine();
		heartRates.setFirstName(firstName);
		System.out.println("Please enter your Last name: ");
		String lastName = input.nextLine();
		heartRates.setLastName(lastName);
		String fullName = heartRates.getFirstName() + heartRates.getLastName();
		
		System.out.println(fullName + " Please enter your year of Birth: ");
		int year = input.nextInt();
		heartRates.setDateOfBirth(year);
		int yearOfBirth = heartRates.getDateOfBirth();
		int age = heartRates.calculateAge();
		int maxHeartRate = heartRates.calculateMaxHeartRate();
		double lowHeartRate = heartRates.calculateLowTargetHeartRate();
		double highHeartRate = heartRates.calcHighTargetHeartRate();
		
		System.out.println("hello " + fullName + "Your details are as follows: ");
		System.out.printf("Birth year: %d%nAge: %d%nMaximum heart rate: %d%nMinium Heart Rate Target: %d%nMaximun Heart Rate Target: ", year, age, maxHeartRate, lowHeartRate, highHeartRate);

		
		
		
		
	
	}
}

class HeartTest{

 		
		private String firstName;
		private String lastName;
		private int dateOfBirth;

		public HeartTest(String firstName, String lastName, int dateOfBirth){
			this.firstName = firstName;
			this.lastName = lastName;
			this.dateOfBirth = dateOfBirth;
		}

		public void setFirstName(String firstName){
			this.firstName = firstName;
		}
		public String getFirstName(){
			return this.firstName;
		}
		public void setLastName(String lastName){
			this.lastName = lastastName;
		}
		public String getLastName(){
			return this.lastName;
		}
		public void setDateOfBirth(int dateOfBirth){
			this.dateOfBirth = dateOfBirth;
		}
		public int getDateOfBirth(int dateOfBirth){
			return this.dateOfBirth;
		}

		public int calculateAge(){
			if(this.dateOfBirth >=  2019){
				return "You are born in the future";
			}else{
				int age = 2019 - getDateOfBirth();
				return age;
			}
			
		}
		public int calculateMaxHeartRate(){
			if(this.dateOfBirth >= 2019){
				return "you have no heart rate";
			}else{
				int heartRate = 220 - calculateAge();
				return hearRate + "per mins";
			}

		}
		public double calculateLowTargetHeartRate(){
			if(this.age >= 2019){
				return "you have no target heart rate yet";
			}else{
				int lowTarget = 0.5 * calculateMaxHeartRate();
				return lowTarget;
				
			}
		}
		public double calcHighTargetHeartRate(){
			if(this.age >= 2019){
				return "you have no target heart rate year";
			}else{
				int highTarget = 0.85 *calculateMaxHeartRate();
				return highTarget;
			}
		}
	
	
}
