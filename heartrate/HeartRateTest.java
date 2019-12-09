import java.util.Scanner;
public class HeartRateTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first Name: ");
		String fname = input.nextLine();
		System.out.println("Please enter last Name: ");
		String lname = input.nextLine();
		System.out.println("Please enter birth day: ");
		int bday = input.nextInt();
		System.out.println("Please enter birth month(in digits please): ");
		int bmonth = input.nextInt();
		System.out.println("Please enter your birth year(in digits please): ");
		int bdyear = input.nextInt();
		HeartRates heartrate = new HeartRates(fname, lname, bday, bmonth, bdyear);
		heartrate.setFirstName(fname);
		heartrate.setLastName(lname);
		heartrate.setDay(bday);
		heartrate.setMonth(bmonth);
		heartrate.setYear(bdyear);
		heartrate.calcAge();
		heartrate.maxHeartRate();
		heartrate.lowTarget();
		heartrate.highTarget();

		System.out.println("Hello " + heartrate.getFirstName() + heartrate.getLastName() + " your details is as follows: ");
		System.out.printf("Age: %d, Maximum heart rate: %d, Minum heart Target: %2f, Maximum heart Target: ", heartrate.calcAge(), heartrate.maxHeartRate(), heartrate.lowTarget()); 			System.out.print(heartrate.highTarget());
		
		
	}
}
