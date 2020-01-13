import java.util.Scanner;

public class Quiz
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		int result = 0;

		System.out.println("WELCOME TO THE BRAIN-TESTING QUIZ!\n");

		System.out.println("A. Who is the founder of Semicolon?\n1. Mr. Aliko Dangote\n2. Mr. Shina Rambo\n3. Mr. Sam Emmanuel\n4. Mr. Wale Adenuga");
		System.out.print("Answer = ");
		int answer1 = input.nextInt();
		if (answer1 == 3)
		{
			result++;
		}
		System.out.println();

		System.out.println("B. Who is the facilitator of Java at Semicolon?\n1. Nonso\n2. Christian\n3. Seyi\n4. Hakeem");
		System.out.print("Answer = ");
		int answer2 = input.nextInt();
		if (answer2 == 1)
		{
			result++;
		}
		System.out.println();

		System.out.println("C. Who is the facilitator of SQL at Semicolon?\n1. Nonso\n2. Christian\n3. Seyi\n4. Hakeem");
		System.out.print("Answer = ");
		int answer3 = input.nextInt();
		if (answer3 == 3)
		{
			result++;
		}

		System.out.println();

		System.out.println("D. Who is the facilitator of Python at Semicolon?\n1. Nonso\n2. Christian\n3. Seyi\n4. Hakeem");
		System.out.print("Answer = ");
		int answer4 = input.nextInt();
		if (answer4 == 2)
		{
			result++;
		}

		System.out.println();

		System.out.println("E. Who is the facilitator of R & Adv. An. at Semicolon?\n1. Nonso\n2. Christian\n3. Seyi\n4. Hakeem");
		System.out.print("Answer = ");
		int answer5 = input.nextInt();
		if (answer5 == 4)
		{
			result++;
		}
		System.out.printf("%nYour result is %d%n", result);

		switch (result)
		{
			case 5:
				System.out.println("Excellent");
				break;
			case 4:
				System.out.println("Very good");
				break;
			case 3:
			case 2:
			case 1:
			default:
				System.out.println("You need to read up!\nCheck this site to improve your knowledge base - www.semicolon.africa/our_staff");
		}
	}
}