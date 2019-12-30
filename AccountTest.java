import java.util.Scanner;

public class AccountTest{
	public static void main(String[] args){
		Account account1 = new Account("John Grey", 50.40);
		Account account2 = new Account("Jane Blue", -7.30);

		/*System.out.printf("%s balance is: %.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance is: %.2f%n", account2.getName(), account2.getBalance());*/

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

	System.out.printf("WITHDRAW MODE!!! \nYour starting balance is: %.2f", account1.getBalance());
	System.out.println("\n\nPlease enter your withdrawal amount for account 1: ");
	double drawAmount = input.nextDouble();
	System.out.printf("%nNow withdrawing %.2f from %s's account balance", drawAmount, account1.getName());
	account1.withdraw(drawAmount);
		if (drawAmount <= account1.getBalance()){
			System.out.printf("\n\n%s's new balance, after withdrawing %.2f, is %.2f%n%n", account1.getName(), drawAmount, account1.getBalance());
		}

		System.out.printf("WITHDRAW MODE!!! \nYour starting balance is: %.2f", account2.getBalance());
		System.out.println("\n\nPlease enter your withdrawal amount for account 2: ");
		drawAmount = input.nextDouble();
		System.out.printf("%nNow withdrawing %.2f from %s's account balance", drawAmount, account2.getName());
		account2.withdraw(drawAmount);
		if (drawAmount <= account2.getBalance()){
			System.out.printf("\n\n%s's new balance, after withdrawing %.2f, is %.2f%n%n", account2.getName(), drawAmount, account2.getBalance());
		}
	}
	
	public static void displayAccount(Account accountToDisplay) {
    System.out.printf("\n\nAccount name "+ accountToDisplay.getName()+ "\nAccount Balance "+ accountToDisplay.getBalance());
}
	
}