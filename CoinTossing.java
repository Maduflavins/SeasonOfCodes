//6.29 (Coin Tossing) Write an application that simulates coin tossing. Let the program toss a coin
//each time the user chooses the Toss Coin menu option. Count the number of times each side of
//the coin appears. Display the results. The program should call a separate method flip that takes no
//arguments and returns a value from a Coin enum (HEADS and TAILS). [Note: If the program realistically
//simulates coin tossing, each side of the coin should appear approximately half the time.]

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing
{
	private static final SecureRandom randomNumbers = new SecureRandom();
	private static final Scanner input = new Scanner (System.in);
	private enum Coin { HEAD, TAIL };

	public static void main (String[] args)
	{
		Coin coinStatus;
		int headPoll = 0;
		int tailPoll = 0;
		int i = 0;
		int coinFlip = 0;

		System.out.println("Hi, Please enter your name! ");
		String name = input.nextLine();

		System.out.printf("%nWelcome %s!", name);
		System.out.print(" Please pick an option.\n1. Play Toss Coin game.\n2. Exit program.\t");
		int choice = input.nextInt();

		if (choice == 1)
			coinFlip = flip();

		while (choice != 2)
		{
			System.out.print("Choose to continue or exit.\n1. Play Toss Coin game.\n2. Exit program.\t");
		choice = input.nextInt();

			coinFlip = flip();

			switch (coinFlip)
			{
				case 1:
					coinStatus = Coin.HEAD;
					headPoll++;
					break;
				case 2:
					coinStatus = Coin.TAIL;
					tailPoll++;
					break;
			}

		i++;
		}

		if (i != 0)
		{
			System.out.printf("There were %d HEADS polled", headPoll);
			System.out.printf("%nThere were %d TAILS polled", tailPoll);
		}
		else
		{
			System.out.println("Game exited!");
		}
	}

	public static int flip()
	{
		int roll = 1 + randomNumbers.nextInt(2);

		if (roll == 1)
		{
			System.out.println("HEAD!");
		}
		else
		{
			System.out.println("TAIL!");
		}
		System.out.println();
		return roll;
	}
}