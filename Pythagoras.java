public class Pythagoras
{
	public static void main (String[] args)
	{
		int sideOne;
		int sideTwo;
		int hypothenuse;

		System.out.println("Side 1\tSide 2\tHypothenuse");

		for (sideOne = 1; sideOne < 500; sideOne++)
		{
			for (sideTwo = 1; sideTwo < 500; sideTwo++)
			{
				for (hypothenuse= 1; hypothenuse < 500; hypothenuse++)
					if ((sideOne * sideOne) + (sideTwo * sideTwo) == (hypothenuse * hypothenuse))
					{
						System.out.printf("%d\t%d\t%d%n", sideOne, sideTwo, hypothenuse);
					}
			}
		}
	}
}