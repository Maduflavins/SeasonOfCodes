/*public class FormatPrint
{
	public static void main (String[] args)
	{
		int i = 1;
		while (i <= 20){
			System.out.printf("%d ", i);
			if (i % 5 != 0){
				System.out.print('\t');
			}
			else {
				System.out.println();
			}
			i++;
		}
	}
}*/

public class FormatPrint
{
	public static void main (String[] args)
	{
		int i;

		for (i = 1; i <= 20; ++i)
		{
			System.out.printf("%d ", i);
			if (i % 5 != 0){
				System.out.print('\t');
			}
			else {
				System.out.println();
			}
		}
	}
}