import java.util.Scanner;

public class Edmodo
{
	public static void main (String[] args)
	{
		int temp = 180;

		if (temp > 90)
		{
			System.out.println("This porridge is too hot.");
			temp = temp - (temp > 150 ? 100 : 20);
		}
		else
		{
			if (temp < 70) 
			{
				System.out.println("This porridge is too cold.");
				temp = temp + (temp < 50 ? 30 : 20);
			}
		}
	
		if (temp == 80) 
		{
			System.out.println("This porridge is just right!");
		}
	}
}