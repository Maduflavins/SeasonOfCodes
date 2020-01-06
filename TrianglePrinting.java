// Exercise 5.10: Printing.java

public class TrianglePrinting
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= i; j++)
				System.out.print('*');
				System.out.println();	
		}
		System.out.println();

		for (int i = 1; i <= 10; i++)
		{
			for (int j = 10; j >= i; j--)
				System.out.print('*');
				System.out.println();	
		}	
		System.out.println();

		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= 10; j++)
			{
				if (j < i) 
				{
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();

		for(int i=1;i<=10;i++)
              	{
			for(int j=0;j<10-i;j++)
                      	{
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
               }
	}
}