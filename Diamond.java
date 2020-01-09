 public class Diamond
{
	public static void main (String[] args)
	{
		int space = 5;
		int star = 1;
		int spaceOne = 2;
		int starOne = 7;

		for (int counter = 1; counter <= 5; counter++)
		{
			for (int i = 1; i <= space; i++)
				System.out.print(" ");
			for (int j = 1; j <= star; j++)
				System.out.print("*");

			space--;
			star += 2;
			System.out.println();
		}

		for (int counter = 1; counter < 5; counter++)
		{
			for (int k = 1; k <= spaceOne; k++)
				System.out.print(" ");
			for (int l = 1; l <= starOne; l++)
				System.out.print("*");

			starOne -= 2;
			spaceOne += 1;
			System.out.println();
		}
	}
}