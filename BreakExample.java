public class BreakExample
{
	public static void main (String[] args)
	{
		int i = 0;
		int j = 1;
		int counter = 0;
		int sum = 0;
		int newSum = 0;

		while (counter <= 15)
		{
			++counter;
			++i;
			++j;

			sum = i + j;
			newSum = sum + 6;

			if (newSum == 21){
				continue;
			}
			System.out.printf("%d, %d, %d%n", i, j, newSum);
		}
	}
}