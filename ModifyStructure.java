

public class ModifyStructure
{
	public static void main (String[] args)
	{
		int i;

		for (i = 1; i <= 10; i++)
		{
			if (i < 5)
			{
				System.out.printf("%d ", i);	
			}
			else if (i == 5)
			{
				System.out.printf("%nBroke out of the loop at count = %d ", i);
			}
			//System.out.println();
		}
	}
}