import java.util.Scanner;
public class SalaryCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int salaryCounter = 0;
		double totalPay = 0;
		while(salaryCounter <= 3){
			//System.out.println("Please enter your name: ");
			//String name = input.nextLine();
			System.out.println("Please enter your pay per hour: ");
			double payPerHour = input.nextDouble();
			System.out.println("Please enter how many hours you worked last week: ");
			int hours = input.nextInt();
			if(hours < 0){
				System.out.println("You have no earnings");
			}
			else if(hours > 40){
				int  payIn40hours = hours / 40;
				int remainHours = hours % 40;
				totalPay = (double)(payIn40hours * payPerHour) + ((payPerHour/2) *remainHours); 
			}else if(hours <= 40){
				totalPay = payPerHour * hours;
			}else{
				System.out.println("You have no earnings");
			}
			System.out.printf("Hi you worked total of %dhrs and your total earning last week is %.2f",hours, totalPay);
			salaryCounter++;
			
			
		}
		
		
		
	}
}
