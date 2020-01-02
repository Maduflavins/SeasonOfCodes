/*public class SumFactorial
{
	public static void main (String[] args)
	{
	
		int sum = 0;
		int counter = 0;
		int fact = 1;
		
		for (int i = 0; i <= 5; i++)
		{
			while (counter < 5)
			{
				fact = fact * (5 - counter);
				++counter;
				System.out.printf("%d! = %d%n", counter, fact);
				sum += fact;
			}
		}
		System.out.println();
		System.out.printf("The sum of five five factorial is " + sum);
	}
}


public class SumFactorial
{
	public static void main (String[] args)
	{
		int sum = 0;
		//int counter = 0;
		int fact = 1;
		
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= i;)
			{
				fact = fact * j;
				System.out.printf("%d! = %d%n", j, fact);
			}
		sum = sum + (i/fact);
		System.out.printf("The sum of the first five factorials is " + sum);
		}
	}
}*/

public class SumFactorial
{
	public static void main (String[] args)
	{
		int total = 0;

		for (int i = 1; i <= 5;){

			int fact = 1;
			
			for (int j = 1; j <= i;){
				fact *= j;
				j++;
			}
			total += fact;
			i++;
		}
		System.out.println("Total is " + total);
	}
}