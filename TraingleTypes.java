import java.util.Scanner;

public class TraingleTypes
{
	public static void main (String[] args)
	{
		
		Scanner input = new Scanner (System.in);

		System.out.print("Please a side: ");
		int a = input.nextInt();

		System.out.print("Enter a second side: ");
		int b = input.nextInt();

		System.out.print("Enter a third side: ");
		int c = input.nextInt();

		if (a == b && b == c && a == c)
		{
			System.out.println("You have entered an equilateral triangle!");
		} else if (a == b && a != c || a != b && a == c ){
			System.out.println("You have entered an iscoceles triangle");
		}

		if (a != b && b != c && a != c)
		{
			System.out.println("You have entered a scalene triangle!");
		}
	}
}