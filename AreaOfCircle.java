//6.20 (Circle Area) Write an application that prompts the user for the radius of a circle and uses
//a method called circleArea to calculate the area of the circle.

import java.util.Scanner;

public class AreaOfCircle
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter the radius of your circle: ");
		double rad = input.nextDouble();

		System.out.printf("The Area of your cirlce is %.2f", circleArea(rad));
	}

	public static double circleArea(double radius)
	{
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
}

	