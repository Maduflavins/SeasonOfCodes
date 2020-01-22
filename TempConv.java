import java.util.Scanner;

public class TempConv
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Press 1 to convert Fahrenheit to Celcius or\nPress 2 to convert Celcius to Fahrenheit: ");
		int temperature = input.nextInt();

		switch(temperature)
		{
			case 1:
				System.out.print("Enter the temperature in Fahrenheit: ");
				double fahTemp = input.nextDouble();
				System.out.printf("The Celcius equivalent of %.2f Fahrenheit is %.2f", fahTemp, celciusValue(fahTemp));
				break;
			case 2:
				System.out.print("Enter the temperature in Celcius: ");
				double celTemp = input.nextDouble();
				System.out.printf("The Fahrenheit equivalent of %.2f Celcius is %.2f", celTemp, fahrenheitValue(celTemp));
		}

	}

		public static double celciusValue(double fahrenheit)
		{
			double celcius = 0;
			celcius = 5.0 / 9.0 * (fahrenheit - 32);
			return celcius;
		}

		public static double fahrenheitValue(double celcius)
		{
			double fahrenheit = 0;
			fahrenheit = 9.0 / 5.0 * (celcius + 32);
			return fahrenheit;
		}
}