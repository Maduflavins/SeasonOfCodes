import java.util.Scanner;

public class PieSeriesOne
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		double pie = 4.00;
		double a = 3;
		double x = 0.00;

		System.out.println("Enter a number to get its pie series: ");
		int n = input.nextInt();

		System.out.println("Iteration\tPie Series Value");
		System.out.println("________________________________");

		for (int i =  1; i <= n; i++)
		{
			switch (i % 2)
			{
				case 0:
					//System.out.printf("%n%d count - x is positive", i);
					x = (4.00 / a);
					//System.out.printf("%nx = %f", x);
					break;
				case 1:
					//System.out.printf("%n%d count - x is negative", i);
					x = (-4.00 / a);
					//System.out.printf("%nx = %f", x);
					break;
			}

			a += 2;
			pie += x;
			//System.out.printf("%5d\t%20f", i, pie);
			//System.out.println();
		}
		//System.out.println("_________________________________");
		System.out.printf("   The final answer is %f%n", pie);
	}
}

//At iteration n0. 600,000, the value 3.14159 is generated