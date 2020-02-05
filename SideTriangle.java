public class SideTriangle
{
	public static void main (String[] args)
	{
		int star = 1;
		int space = 10;
		int spaceX = 5;
		int starA = 10;
		int spaceA = 1;
		int starB = 10;
		int spaceB = 1;
		int starC = 1;
		int spaceC = 10;

		for (int x = 1; x <= 10; x++)
		{
			for (int i = 1; i <= star; i++)
			{
				System.out.print("*");
			}
			for (int j = 1; j <= space; j++)
			{
				System.out.print(" ");
			}
			for (int l = 1; l <= spaceA; l++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= starA; k++)
			{
				System.out.print("*");
			}

			for (int c = 1; c <= spaceX; c++)
			{
				System.out.print(" ");
			}

			for (int n = 1; n <= starB; n++)
			{
				System.out.print("*");
			}
			for (int m = 1; m <= spaceB; m++)
			{
				System.out.print(" ");
			}
			for (int p = 1; p <= spaceC; p++)
			{
				System.out.print(" ");
			}
			for (int q = 1; q <= starC; q++)
			{
				System.out.print("*");
			}
		
			star++;
			space--;
			starA--;
			spaceA++;
			spaceX = spaceX;
			starB--;
			spaceB++;
			starC++;
			spaceC--;
			System.out.println();
		}
	}
}