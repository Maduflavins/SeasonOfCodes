import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumber
{
	private static final SecureRandom randomNumber = new SecureRandom();
	private static final Scanner input = new Scanner (System.in);

	public static void main (String[] args)
	{
		int i = 0;

		int value = guessNumber();

		System.out.print("Guess a number between 1 and 30: ");
		int number = input.nextInt();

		if (number == value)
		{
			System.out.println("Congratulations. You guessed the number!");
		}

		while (i <= 4)
		{
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
			/*if (number == value)
			{
				System.out.println("Congratulations. You guessed the number!");
			}*/
			i++;

			System.out.print("Guess a number between 1 and 30: ");
			number = input.nextInt();
		}
		System.out.printf("The number is %d%n", value);
	}

	public static int guessNumber()
	{
		int randNum = 1 + randomNumber.nextInt(30);
		return randNum;
	}
}

