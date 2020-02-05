//Look at the shape very closely
//Look out for the space and stars 
//And figure out where what will be printed
//Draw out how many of them you need
//and then begin with a mother loop
//The mother loop created the rows for the shape
//The other loops fill up the spaces with space or stars

public class Debbie
{
	public static void main (String[] args)
	{
		int space = 5;
		int star = 1;

		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= space; j++)
			{
				System.out.print("+");
			}
			for (int k = 1; k <= star; k++)
			{
				System.out.print("*");
			}
			space--;
			star++;
			System.out.println();
		}
	}
}