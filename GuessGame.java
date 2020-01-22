import java.util.Scanner;
import java.security.SecureRandom;

public class GuessGame
{
	public static void main (String[] args)
	{
		//int counter = 1;
		
		SecureRandom guessFigure = new SecureRandom();
		Scanner input = new Scanner (System.in);
		
		int guessNumber = 1 + guessFigure.nextInt(10);
		
		for (int i = 1; i <= 5; i++){
			System.out.print("Guess a number between 1 and 10: ");
			int number = input.nextInt();
			
			if (number == guessNumber)
			{
				System.out.printf("Smartass! You got it right in %d attempts", i);
				break;
			}
			if (number != guessNumber && i <= 5)
			{
				System.out.print("Wrong answer! Guess a number between 1 and 10: ");
				number = input.nextInt();
			}
			else if (number != guessNumber && i == 5)
			{
				System.out.print("Your last attempt to guess a number between 1 and 10: ");
				number = input.nextInt();
			}
		}
		
		
				
	}
}