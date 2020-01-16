//AccountsTest.java drives the Accounts.java class by calling its methods
//This document describes manipulating & creating Accounts object

import java.util.Scanner;

public class AccountsTest
{
	public static void main(String[] args)
	{
		//Scanner object receives input from a user
		Scanner input = new Scanner (System.in);

		//Create an Accounts object and assign it to myAccount
		Accounts myAccount = new Accounts();

		//(Set and ) Display initial value of name to null
		System.out.printf("Initial name is %s%n%n", myAccount.getName());

		//Request and read the name entered
		System.out.println("Please enter the name: ");	//user is prompted to enter a name
		String theName = input.nextLine();	//read (a line of) the text
		myAccount.setName(theName);		//put theName in myAccount
		System.out.println();			//returns a blank line

		//display the name stored in the object myAccount
		System.out.printf("Name in the object myAccount is: %n%s%n", myAccount.getName());
	}
} //end class AccountsTest