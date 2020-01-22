public class ValueProduct
{
	public static void main (String[] args)
	{
		long oddProduct = 1;
		long evenProduct = 1;

		for (int i = 1; i <= 40; i++)
		{
			if (i % 2 == 0)
			{
				System.out.printf("values are %d%n", i);
				evenProduct *= i;
			}
			else if (i % 2 != 0)
			{
				System.out.printf("values are %d%n", i);
				oddProduct *= i;
			}
		}
		System.out.println(evenProduct);
		System.out.println(oddProduct);
	}
}