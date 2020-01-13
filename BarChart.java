import java.util.Scanner;

public class BarChart
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		//int n = 1;
		int total = 0;
		int result = 0;
		int firstn =0;
		int secondn =0;
		int thirdn =0;
		int fourthn=0;
		int fifthn=0;

		//while (n <= 5)
		{
			System.out.println("Enter a number between 1 and 30:\n To cancel Program, press \"ctrl\"+z ");
			
			while (input.hasNext())
				{
					firstn = input.nextInt();
					secondn = input.nextInt();
					thirdn = input.nextInt();
					fourthn = input.nextInt();
					fifthn = input.nextInt();				
				}
			//n++;
			
			//for (int c = 1; c <= 5; c++)
			//{
				System.out.printf("%d - | ", firstn);
				for (int i = 1; i <= firstn; i++)
				{
					System.out.print("*");
				}
				System.out.println();

				System.out.printf("%d - | ", secondn);
				for (int j = 1; j <= secondn; j++)
				{
					System.out.print("*");
					//System.out.println();
				}
				System.out.println();

				System.out.printf("%d - | ", thirdn);
				for (int k = 1; k <= thirdn; k++)
				{
					System.out.print("*");
					//System.out.println();
				}
				System.out.println();
								
				System.out.printf("%d - | ", fourthn);
				for (int l = 1; l <= fourthn; l++)
				{
					System.out.print("*");
					//System.out.println();
				}
				System.out.println();
	
				
				System.out.printf("%d - | ", fifthn);
				for (int m = 1; m <= fifthn; m++)
				{
					System.out.print("*");
					//System.out.println();
				}
				System.out.println();
			//}
		}
	}
}