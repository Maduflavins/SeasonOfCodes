import java.security.SecureRandom;

import java.util.Scanner;

public class GuessNums
{
	private static final SecureRandom randomNumber = new SecureRandom();
	private static final Scanner input = new Scanner (System.in);

	public static void main (String[] args)
	{
		int i = 1;
		int value = guessNumber();
		int number = 0;

		while (i <= 10)
		{
			System.out.print("Guess a number between 1 and 100: ");
			number = input.nextInt();

			if (1 < 10 && number == value)
			{
				System.out.println("Either you know the secret or you got lucky!");
				System.out.printf("%nNumber of tries is %d%n", i);
				break;
			}

			if (1 == 10 && number == value)
			{
				System.out.println("Either you know the secret or you got lucky!");
				System.out.printf("%nNumber of tries is %d%n", i);
				break;
			}

			if (number != value)
			{
				if (number > value)
				{
					System.out.println("Too high. Try again");
				}
				else if (number < value)
				{
					System.out.println("Too low. Try again");
				}
			}
			if (i == 10 && number != value)
			{
				System.out.printf("%nYou should be able to do better! The number is %d%n", value);
			}
			i++;
		}
	}	

	public static int guessNumber()
	{
		int randNum = 1 + randomNumber.nextInt(100);
		return randNum;
	}
}