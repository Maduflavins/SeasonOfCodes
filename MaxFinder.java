import java.util.Scanner;

public class MaxFinder{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the floating-point numbers, separated by spaces: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();

		double result = maximum(num1, num2, num3);

		System.out.println("Maximum value is: " + result);
	}

	public static double maximum(double x, double y, double z)
	{
		
		double maxValue = x;

		if (y > maxValue)
			maxValue = y;

		if (z > maxValue)
			maxValue = z;

		return maxValue;
	}
}