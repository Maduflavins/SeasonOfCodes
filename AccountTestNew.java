import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args)
	{
		Account account1 = new Account("John Grey", 50.40);
		Account account2 = new Account("Jane Blue", 17.30);

		displayAccount(account1);
		displayAccount(account2);
	}

	public static void displayAccount(Account accountToDisplay)
	{
		System.out.println("The Account Details Thus:");
		System.out.printf("Account Name: %s; Account Balance: %.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
	}
}