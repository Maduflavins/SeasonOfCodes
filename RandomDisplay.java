//6.13 Write statements that will display a random number from each of the following sets:
//a) 2, 4, 6, 8, 10.	done
//b) 3, 5, 7, 9, 11.
//c) 6, 10, 14, 18, 22.

import java.security.SecureRandom;

public class RandomDisplay
{
	public static void main (String[] args)
	{
		SecureRandom input = new SecureRandom();

		int randomNumber1 = 2 + 2 * input.nextInt(5);
		System.out.printf("The first guessed number is %d%n", randomNumber1);

		int randomNumber2 = 3 + 2 * input.nextInt(5);
		System.out.printf("The second guessed number is %d%n", randomNumber2);

		int randomNumber3 = 6 + 4 * input.nextInt(5);
		System.out.printf("The third guessed number is %d%n", randomNumber3);
	}
}