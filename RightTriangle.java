import java.util.Scanner;

public class RightTriangle
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter a side for the triange: ");
		int o = input.nextInt();

		System.out.print("Enter a side for the triangle: ");
		int a = input.nextInt();

		System.out.print("Enter the longest side: ");
		int h = input.nextInt();

		int hypothenuse = h * h;
		int opposite = o * o;
		int adjacent = a * a;

		if (hypothenuse == adjacent + opposite)
		{
			System.out.println("The sides you entered represent a right-angled triangle");
		}
		else 
		{
			System.out.println("The sides you entered do not represent a right-angled triangle");
		}
	}
}