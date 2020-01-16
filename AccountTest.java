import java.util.Scanner;

public class AccountTest{
	public static void main(String[] args){
		Account account1 = new Account("John Grey", 50.40);
		Account account2 = new Account("Jane Blue", -7.30);

		System.out.printf("%s balance is: %.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance is: %.2f%n", account2.getName(), account2.getBalance());

	//Scanner to obtain input from window
	Scanner input = new Scanner(System.in);

	System.out.println("Enter a deposit amount for account 1: ");
	double depositAmount = input.nextDouble();
	System.out.printf("%nNow adding %.2f to %s's account balance%n%n", depositAmount, account1.getName());
	account1.deposit(depositAmount); //the addition or update balance function call

	//display results
	System.out.printf("%s's balance is now: $%.2f%n", account1.getName(), account1.getBalance());
	System.out.printf("%s's balance is now: $%.2f%n", account2.getName(), account2.getBalance());

	//DO the same for account2
	System.out.println("Enter a deposit amount for account 2: ");
	depositAmount = input.nextDouble();
	System.out.printf("%nNow adding %.2f to %s's account balance%n%n", depositAmount, account2.getName());
	account2.deposit(depositAmount);

	System.out.printf("%s's balance is now: %.2f%n", account1.getName(), account1.getBalance());
	System.out.printf("%s's balance is now: %.2f%n", account2.getName(), account2.getBalance());


	}
}