import java.util.Scanner;
public class CreditCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int customerCounter = 1;
		while(customerCounter <= 10){
			System.out.println("Please enter your account number(10 digits please): ");
			int accountNumber = input.nextInt();
			System.out.println("Please enter your balance at the beginning of the month: ");
			int balance = input.nextInt();
			System.out.println("Please enter total of items charged: ");
			int totalItemsCharged = input.nextInt();
			System.out.println("Please enter credits applied ");
			int creditApplied = input.nextInt();
			System.out.println("Please enter credit limit: ");
			int creditLimit = input.nextInt();
			int newBalance = balance + totalItemsCharged - creditApplied;
			if( newBalance > creditLimit){
				System.out.println("Credit limit exceeded");
			}else{
				System.out.println("Credit Limit not exceeded yet");
			}
			customerCounter++;
			
		}
	}
}
