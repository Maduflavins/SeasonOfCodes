import java.util.Scanner;

import java.security.SecureRandom;

public class ComputerInstruction
{
	private static final SecureRandom randomNumber = new SecureRandom();
	private static final Scanner input = new Scanner (System.in);

	public static void main (String[] args)
	{
		
		int a = 1 + randomNumber.nextInt(9);
		int b = 1 + randomNumber.nextInt(9);
		int prodNum = a * b;

		System.out.println("Press 1 to learn multiplication or -1 to exit: ");
		//String response = input.nextLine();
		int response = input.nextInt();

		if (response == 1)
		{
			System.out.printf("Whatis %d times %d: ", a, b);
			int answer = input.nextInt();
			if (answer == prodNum)
			{
				System.out.println("Very good!");
			}		

			while (response != -1)
			{		
				productNumbers(a, b);
				if (answer != prodNum)
				{
					productNumbers(a, b);
				}
			}
		}
		else
		{
			System.out.println("Coward! You chickened out!");
		}
	}

	public static int productNumbers(int a, int b)
	{
		a = 1 + randomNumber.nextInt(9);
		b = 1 + randomNumber.nextInt(9);
		System.out.printf("What is %d times %d: ", a, b);
		int answer = input.nextInt();
		int prodNum = a * b;
		if (answer == prodNum)
		{
			System.out.println("Very good!");
		}
		while (answer != prodNum)
		{
			System.out.println("No! Try Again");
			System.out.printf("What is %d times %d: ", a, b);
			answer = input.nextInt();
			if (answer == prodNum)
			{
				System.out.println("Very good!");
			}
		}
		return prodNum;		
	}
}