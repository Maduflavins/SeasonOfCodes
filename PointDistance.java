//6.32 (Distance Between Points) Write method distance to calculate the distance between two points (x1, y1) and (x2, y2). All numbers and return values //should be of type double. Incorporate this method into an application that enables the user to enter the coordinates of the points.

import java.util.Scanner;

public class PointDistance
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Value for x(1): ");
		double xA = input.nextInt();

		System.out.print("Value for x(2): ");
		double xB = input.nextInt();

		System.out.print("Value for y(1): ");
		double yA = input.nextInt();

		System.out.print("Value for y(2): ");
		double yB = input.nextInt();

		System.out.printf("Distance of the line is: %.2fm", calcDistance(xA, xB, yA, yB));
	}

	public static double calcDistance(double xOne, double xTwo, double yOne, double yTwo)
	{
		//double xOne, xTwo, yOne, yTwo;

		double distance = Math.sqrt(Math.pow((xOne - xTwo), 2) + Math.pow((yOne - yTwo), 2));
		return distance;
	}
}






