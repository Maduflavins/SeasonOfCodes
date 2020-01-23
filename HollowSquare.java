public class HollowSquare
{
	public static void main (String[] args)
	{
		int star = 1;
		int space = 4;
		
		for (int i = 1; i <= 5; i++)
		{
			System.out.print("*");
		}
		System.out.println();

		for (int x = 1; x <= 3; x++)
		{
			for (int i = 1; i <= star; i++)
			{
				System.out.print("*");
			}
			for (int j = 1; j < space; j++)
			{
				System.out.print(" ");
			}
			for (int l = 1; l <= star; l++)
			{
				System.out.print("*");
			}

			star = star;
			space = space;
			System.out.println();
		}
		for (int i = 1; i <= 5; i++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}