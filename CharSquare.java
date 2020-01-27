//6.19 (Displaying a Square of Any Character) Modify the method created in Exercise 6.18 to receive a second parameter of type char called fillCharacter. //Form the square using the char provided as an argument. Thus, if side is 5 and fillCharacter is #, the method should display the square accordingly. Use //the following statement (in which input is a Scanner object) to read a character from the user at the keyboard: char fill = input.next().charAt(0);

import java.util.Scanner;

public class CharSquare
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter the number of sides of squares: ");
		int s = input.nextInt();

		System.out.print("...of what chararcter!: ");
		char c = input.next().charAt(0);
		System.out.println();
		squareOfAsterisks(s, c);
	}

	public static int squareOfAsterisks(int side, char fill)
	{
		for (int i = 1; i <= side; i++)
		{
			for (int j = 1; j <= side; j++)
			{			
				System.out.print(fill);
			}
			System.out.println();
		}
		return side;
	}
}