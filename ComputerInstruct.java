import java.util.Scanner;

import java.security.SecureRandom;

public class ComputerInstruct
{
	private static final SecureRandom randomNumber = new SecureRandom();
	private static final Scanner input = new Scanner (System.in);

	public static void main (String[] args)
	{
		
		int a = 1 + randomNumber.nextInt(9);
		int b = 1 + randomNumber.nextInt(9);
		int prodNum = a * b;

		System.out.println("Press 1 to learn multiplication or -1 to exit: ");
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
			switch (prodNum % 4)
			{
				case 0:
					System.out.println("Very good!");
					break;
				case 1:
					System.out.println("Excellent!");
					break;
				case 2:
					System.out.println("Nice work!");
					break;
				case 3:
					System.out.println("Keep up the good work!");
					break;
			}
			
		}
		while (answer != prodNum)
		{
			//System.out.println("No! Try Again");
			
			switch (answer % 4)
			{
				case 0:
					System.out.println("Please try again!");
					break;
				case 1:
					System.out.println("Try once more!");
					break;
				case 2:
					System.out.println("Dont give up!");
					break;
				case 3:
					System.out.println("No! keep trying!");
					break;
			}

			System.out.printf("What is %d times %d: ", a, b);
			answer = input.nextInt();
			if (answer == prodNum)
			{
				//System.out.println("Very good!");
				switch (prodNum % 4)
				{
					case 0:
						System.out.println("Very good!");
						break;
					case 1:
						System.out.println("Excellent!");
						break;
					case 2:
						System.out.println("Nice work!");
						break;
					case 3:
						System.out.println("Keep up the good work!");
						break;
				}
			}
		}
		return prodNum;		
	}
}