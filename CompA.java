import java.util.Scanner;

import java.security.SecureRandom;

public class CompA
{
	private static final SecureRandom randomNumber = new SecureRandom();
	private static final Scanner input = new Scanner (System.in);

	public static void main (String[] args)
	{	
		int correctScore = 0;
		int wrongScore = 0;
		for (int i = 1; i <= 10; i++)
		{
			int x = 1 + randomNumber.nextInt(9);
			int y = 1 + randomNumber.nextInt(9); 
			System.out.printf("%nWhat is %d times %d: ", x, y);
			productNumbers(x, y, correctScore, wrongScore);
		}
		System.out.printf("You got %d questions correctly", correctScore);
	}

	public static int productNumbers(int a, int b, int c, int w) //a and b are the numbers. c and w are counter for right and wrong answers
	{
		c = 0;
		w = 0;
		int answer = input.nextInt();
		int prodNum = a * b;
		switch(answer % prodNum)
		{
			case 0:
				++c;
				System.out.printf("You got %d questions correctly", c);
				break;
				
			default:
				++w;
				break;
		}
		/*if (answer == prodNum)
			c++;
		else 
			w++;*/
		
		return prodNum;
	}
}

	