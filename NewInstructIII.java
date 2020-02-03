import java.util.Scanner;
import java.security.SecureRandom;

public class NewInstructIII
{
	private static final Scanner input = new Scanner (System.in);
	private static final SecureRandom randomNumber = new SecureRandom();
 
	public static void main (String[] args)
	{
		mainWork();
	}

	public static void mainWork()
	{
		int correctAnswer = 0;
		int wrongAnswer = 0;
		for (int c = 1; c <= 10; c++){

			int i = firstNumber(10);
			int j = secondNumber(10);

			System.out.printf("What is %d time %d: ", i, j);
			int answer = input.nextInt();

			if (answer == i * j)
			{
				//System.out.println("Correct Answer!");
				int statementValue = randomNumber.nextInt(4);
				switch (statementValue)
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
				++correctAnswer;
			}
			else 
			{
				//System.out.println("Wrong Answer!");
				int statementValue = randomNumber.nextInt(4);
				switch (statementValue)
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
				++wrongAnswer;
			}
		}			
			System.out.printf("You got %d right", correctAnswer);
			System.out.printf("%nYou got %d wrong", wrongAnswer);

		int scorePercent = correctAnswer * 10;
		System.out.println("\nYou score " + scorePercent + "%");

		if (scorePercent > 75)
		{
			System.out.println("\nCongratulations, you are ready to go to the next level!");
		}
		else
		{
			System.out.println("\nPlease ask your teacher for extra help!");
		}
		return;
	}

	public static int firstNumber(int a) //return the first number
	{
		int x = 1 + randomNumber.nextInt(a);
		return x;
	}

	public static int secondNumber(int b) //return the second number
	{
		int y = 10 + randomNumber.nextInt(b);
		return y;
	}
}

	