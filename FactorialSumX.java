import java.util.Scanner;

public class FactorialSumX
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = input.nextInt();

		double invFact = 1;
		int factorial = 1;
		int num = 2; 
		int j = 1;
	
		for (int i = 2; i <= n; i++)
		{
			while (j <= n)
			{
				++num;
				factorial *= num;
				invFact = (double) 1 / factorial;			
			}	
		}
		System.out.print(invFact);
	}
}