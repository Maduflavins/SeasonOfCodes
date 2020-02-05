import java.util.Scanner;

public class FactorialSum
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		long factorialSum = 0;
	
		for (int i = 1; i <= n; i++)
		{
			long factorial = 1;
			
			for (int j = 1; j <= i; j++)
			{
				factorial *= j;	
			}
			factorialSum += factorial;
			System.out.printf("%d!\tis\t %d", i, factorial);
			System.out.println();
		}
		System.out.printf("The sum of the %d factorials is %d", n, factorialSum);
	}
}