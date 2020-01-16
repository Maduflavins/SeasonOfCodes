import java.util.Scanner;

public class EvenAdd
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Sum of first n integers: ");

		int n = input.nextInt();
 
		int i = 0;
		int sum = 0;

		while (i <= n)
		{
			int product = i * 3;
			sum += product;
			i++;
		}
		System.out.printf("Sum is %d", sum);
	}
}