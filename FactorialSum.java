import java.util.Scanner;

public class FactorialSum
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = input.nextInt();
	
		for (int i = 1; i <= n; i++)
		{
			long factorial = 1;

			for (int j = 1; j <= i; j++)
			{
				factorial *= j;
			}
			System.out.printf("%d!\tis\t %d", i, factorial);
			System.out.println();
		}
	}
}