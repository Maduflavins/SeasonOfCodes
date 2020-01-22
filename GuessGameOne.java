import java.util.Scanner;
import java.security.SecureRandom;

public class GuessGameOne
{
	public static void main (String[] args)
	{
		SecureRandom guessFigure = new SecureRandom();
		Scanner input = new Scanner (System.in);

		int guessNumber = 1 + guessFigure.nextInt(10);
		System.out.print("Guess a number between 1 and 10: ");

		for (int i = 1; i <= 5; i++)
		{
			int inputNumber = input.nextInt();
			if (inputNumber == guessNumber)
			{
				System.out.println("You got it right!");
			}
			else if (inputNumber != guessNumber)
			{
				System.out.println("You got it wrong!");
			}

			System.out.print("Wrong! Guess a number between 1 and 10: ");
		}
	}
}