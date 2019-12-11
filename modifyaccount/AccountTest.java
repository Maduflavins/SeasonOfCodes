import java.util.Scanner;
public class AccountTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Account account1 = new Account("Jane Chiza", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		displayAccount(account1);
		displayAccount(account2);
		System.out.println("Please enter Deposit Amount:");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to Account", depositAmount);
		account1.deposit(depositAmount);
		System.out.println();
		displayAccount(account1);
		displayAccount(account2);
		System.out.println("Please enter deposit Amount: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding $.%2f to Account", depositAmount);
		System.out.println();
		account2.deposit(depositAmount);
		displayAccount(account2);
		System.out.println("Enter withdrawl amount: ");
		double withdrawAmount = input.nextDouble();
		account1.withdraw(withdrawAmount);
		
	}
	public static void displayAccount(Account account){
		System.out.printf("%s balance: %.2f%n", account.getName(), account.getBalance());
	}
}
