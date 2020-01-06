// Exercise 5.10: Printing.java

public class TrianglePrinting1
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= i; j++)
				if (j < i){
					System.out.print("");
				}
				else {
					System.out.print('*');
				}
		}			
	}
}


		