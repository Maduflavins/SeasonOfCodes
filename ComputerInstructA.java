import java.util.Scanner;

import java.security.SecureRandom;

public class ComputerInstructA
{
	private static final SecureRandom randomNumber = new SecureRandom();
	private static final Scanner input = new Scanner (System.in);

	public static void main (String[] args)
	{
		
		int a = 1 + randomNumber.nextInt(9);
		int b = 1 + randomNumber.nextInt(9);
		int prodNum = a * b;
		int correctScore = 0;
		int i = 1;

		System.out.println("Press 1 to learn multiplication or -1 to exit: ");
		int response = input.nextInt();

		while (response != -1)
		{
			System.out.printf("%nWhat is %d times %d: ", a, b);
			int answer = input.nextInt();
			if (answer == prodNum)
			{
				System.out.println("Very good!");
				correctScore++;
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
		//else
		//{
		//	System.out.println("Coward! You chickened out!");
		//}
	}

	public static int productNumbers(int a, int b)
	{
		a = 1 + randomNumber.nextInt(9);
		b = 1 + randomNumber.nextInt(9);
		System.out.printf("%nWhat is %d times %d: ", a, b);
		int answer = input.nextInt();
		int prodNum = a * b;
		if (answer == prodNum)
		{
			int response = 1 + randomNumber.nextInt(4);
			switch (response)
			{
				case 1:
					System.out.println("Very good!");
					break;
				case 2:
					System.out.println("Excellent!");
					break;
				case 3:
					System.out.println("Nice work!");
					break;
				case 4:
					System.out.println("Keep up the good work!");
					break;
			}
			
		}
		while (answer != prodNum)
		{
			int response = 1 + randomNumber.nextInt(4);
			switch (response)
			{
				case 1:
					System.out.println("No. Please try again.");
					break;
				case 2:
					System.out.println("Wrong. Try once more.");
					break;
				case 3:
					System.out.println("Don't give up!");
					break;
				case 4:
					System.out.println("No. Keep trying.");
					break;
			}

			System.out.printf("%nWhat is %d times %d: ", a, b);
			answer = input.nextInt();
			if (answer == prodNum)
			{
				response = 1 + randomNumber.nextInt(4);
				switch (response)
				{
					case 1:
						System.out.println("Very good!");
						break;
					case 2:
						System.out.println("Excellent!");
						break;
					case 3:
						System.out.println("Nice work!");
						break;
					case 4:
						System.out.println("Keep up the good work!");
						break;
				}
			}
		}
		return prodNum;		
	}
}