import java.util.Scanner;

public class XmasSong
{
	public static void main (String[] args)
	{
		int counter = 1;

		//Scanner input = new Scanner (System.in);

		//System.out.print("Enter a number for a day within the 12 Christmas days!: ");
		//int dayValue = input.nextInt();

		for (counter = 1; counter <= 12; counter++)
		{

			System.out.print("\n\nOn the ");

			switch (counter)
			{
				case 1:
					System.out.print("first");
					break;
				case 2:
					System.out.print("second");
					break;
				case 3:
					System.out.print("third");
					break;
				case 4:
					System.out.print("fourth");
					break;
				case 5:
					System.out.print("fifth");
					break;
				case 6:
					System.out.print("sixth");
					break;
				case 7:
					System.out.print("seventh");
					break;
				case 8:
					System.out.print("eight");
					break;
				case 9:
					System.out.print("ninth");
					break;
				case 10:
					System.out.print("tenth");
					break;
				case 11:
					System.out.print("eleventh");
					break;
				case 12:
					System.out.print("twelfth");
					break;				
			}
		System.out.print(" day of Christmas\nMy true love sent to me...");
		
			switch (counter)
			{
				case 12:
					System.out.print("\nTwelve drummers drumming");
				case 11:
					System.out.print("\nEleven pipers piping");
				case 10:
					System.out.print("\nTen lords a leaping");
				case 9:
					System.out.print("\nNine ladies dancing");
				case 8:
					System.out.print("\nEight maids a milking");
				case 7:
					System.out.print("\nSeven swans a swimming");
				case 6:
					System.out.print("\nSix geese a laying");
				case 5:
					System.out.print("\nFive gold rings");
				case 4:
					System.out.print("\nFour calling birds");
				case 3:
					System.out.print("\nThree French hens");
				case 2:
					System.out.print("\nTwo turtle doves and");
				case 1:
					System.out.println("\na patridge in a pear tree!");
			}
		}
	}
}