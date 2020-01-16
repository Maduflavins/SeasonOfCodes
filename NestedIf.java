import java.util.Scanner;

public class NestedIf
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter your grade: ");
		int g = input.nextInt();

		if (g > 90)
		{
			System.out.println("A");
		}
		else if (g >= 80){
			System.out.println("B");
		}
		else if (g >= 70)
			System.out.println("C");
		else if (g >= 60)
			System.out.println("D");
		else
			System.out.print("F");
	}
}