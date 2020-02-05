import java.util.Scanner;

import java.security.SecureRandom;

public class Comp
{
	private static final SecureRandom randomNumber = new SecureRandom();
	private static final Scanner input = new Scanner (System.in);

	public static void main (String[] args)
	{
		
		int a = 1 + randomNumber.nextInt(9);
		int b = 1 + randomNumber.nextInt(9);
		int prodNum = a * b;
		int correctScore = 0;
		int j = 1;

		System.out.println("Press 1 to learn multiplication or -1 to exit: ");
		int response = input.nextInt();
		
		if (response == 1)
		{
			for (int i = 1; i <= 5; i++)
			{
				productNumbers(a, b);
						

				while (response != -1 && j <= 5)
				{		
					productNumbers(a, b);
					//correctScore++;
					j++;	
				}
			}
		}
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
			switch (prodNum % 4)
			{
				case 0:
					System.out.println("Very good!...1");
					break;
				case 1:
					System.out.println("Excellent!...1");
					break;
				case 2:
					System.out.println("Nice work!...1");
					break;
				case 3:
					System.out.println("Keep up the good work!...1");
					break;
			}
			
		}
		while (answer != prodNum)
		{			
			switch (answer % 4)
			{
				case 0:
					System.out.println("Please try again!...");
					break;
				case 1:
					System.out.println("Try once more!...");
					break;
				case 2:
					System.out.println("Dont give up!...");
					break;
				case 3:
					System.out.println("No! keep trying!...");
					break;
			}

			System.out.printf("%nWhat is %d times %d: ", a, b);
			answer = input.nextInt();
			if (answer == prodNum)
			{
				switch (prodNum % 4)
				{
				case 0:
					System.out.println("Very good!...");
					break;
				case 1:
					System.out.println("Excellent!...");
					break;
				case 2:
					System.out.println("Nice work!...");
					break;
				case 3:
					System.out.println("Keep up the good work!...");
					break;
				}
			}
		}
			return prodNum;		
	}
}
