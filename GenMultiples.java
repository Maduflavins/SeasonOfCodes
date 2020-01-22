import java.security.SecureRandom;
import java.util.Scanner;

public class GenMultiples
{
	public static void main (String[] args)
	{
		SecureRandom randomNumber = new SecureRandom();

		int randNum = 1 + randomNumber.nextInt(20);

		for (int i = 1; i <= 20; i++)
		{
			randNum = 1 + randomNumber.nextInt(20);

			if (randNum % 3 == 0)
			{
				System.out.printf("%d has 3 as its multiple%n", randNum);
			}
		}
	}
}