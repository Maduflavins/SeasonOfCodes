import java.util.Scanner;

public class HollowSquareMod
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter the number of sides for your square: ");
		int n = input.nextInt();

		int star = 1;
		int space = n; //enetered integer
		
		for (int i = 1; i <= space; i++) //space + 1
		{
			System.out.print("*");
		}
		System.out.println();

		for (int x = 1; x <= space - 2; x++) //space - 2
		{
			for (int i = 1; i <= star; i++) //star as it is constant
			{
				System.out.print("*");
			}
			for (int j = 1; j < space - 1; j++) //space remains
			{
				System.out.print(" ");
			}
			for (int l = 1; l <= star; l++) //star remains again
			{
				System.out.print("*");
			}

			star = star;
			space = space;
			System.out.println();
		}
		for (int i = 1; i <= space; i++) //space + 1 again
		{
			System.out.print("*");
		}
		System.out.println();
	}
}