import java.util.Scanner;
import java.security.SecureRandom;

public class NewInstructIV
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
		int i = 0;
		int j = 0;

		System.out.println("Please pick a difficulty level - 1, 2 or 3: ");
		int difficulty = input.nextInt();

		for (int c = 1; c <= 10; c++){

			switch(difficulty)
			{
				case 1:
					i = firstNumber(9);
					j = secondNumber(9);
					break;
				case 2:
					i = thirdNumber(10);
					j = fourthNumber(10);
					break;
				case 3:
					i = fifthNumber(20);
					j = sixthNumber(25);
					break;
			}

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
		int x = 1+ randomNumber.nextInt(a);
		return x;
	}

	public static int secondNumber(int b) //return the second number
	{
		int y = 1 + randomNumber.nextInt(b);
		return y;
	}
	
	public static int thirdNumber(int c) //return the first number
	{
		int w = 1 + randomNumber.nextInt(c);
		return w;
	}

	public static int fourthNumber(int d) //return the second number
	{
		int z = 10 + randomNumber.nextInt(d);
		return z;
	}

	public static int fifthNumber(int e) //return the first number
	{
		int o = 10 + randomNumber.nextInt(e);
		return o;
	}

	public static int sixthNumber(int f) //return the second number
	{
		int p = 10 + randomNumber.nextInt(f);
		return p;
	}
}

	