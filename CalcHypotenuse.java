//6.15 (Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of a right triangle when the lengths of the other two sides are //given. The method should take two arguments of type double and return the hypotenuse as a double. Incorporate this method into an application that reads //values for side1 and side2 and performs the calculation with the hypotenuse method. Use Math methods pow and sqrt to determine the length of the //hypotenuse for each of the triangles in Fig. 6.15. [Note: Class Math also provides method hypot to perform this calculation.]


import java.util.Scanner;

public class CalcHypotenuse
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter the Opposite side: ");
		double opposite = input.nextDouble();

		System.out.print("Enter the adjacent: ");
		double adjacent = input.nextDouble();

		//System.out.print("Number of rows on the table: ");
		//int r = input.nextInt();

		System.out.println("Triangle\tOpposite\tAdjacent\tHypotenuse");

		double result = hypotenuse(opposite, adjacent);
		System.out.printf("%22.2f\t%14.2f\t%15.2f", opposite, adjacent, result);

		//for (int i = 1; i <= r; i++)
		//{
			
		//}
	}

	public static double hypotenuse(double oppSide, double adjSide)
	{
		double hypo = Math.sqrt(Math.pow(oppSide, 2) + Math.pow(adjSide, 2));
		return hypo;
	}
}