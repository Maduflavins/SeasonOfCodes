import java.util.Scanner;

import java.security.SecureRandom;

public class NewInstruction
{
	private static final SecureRandom randomNumber = new SecureRandom();
	private static final Scanner input = new Scanner (System.in);

	public static void main (String[] args)
	{
		System.out.println("Press 1 to learn multiplication or -1 to exit: ");
		int response = input.nextInt();

		while (response == 1)
		{
			productNumbers();
		}
	}

	public static int productNumbers()
	{
		int a = 1 + randomNumber.nextInt(9);
		int b = 1 + randomNumber.nextInt(9);
		System.out.printf("What is %d times %d: ", a, b);
		int answer = input.nextInt();
		int prodNum = a * b;
		
		while (answer != prodNum)
		{
			System.out.println("No! Try Again");
			System.out.printf("What is %d times %d: ", a, b);
			answer = input.nextInt();
		}
		if (answer == prodNum)
		{
			System.out.println("Very good!");
		}
		return prodNum;		
	}
}