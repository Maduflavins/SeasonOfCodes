import java.util.Scanner;

public class PrintOrder{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);

		//int counter = 1;
		int x = 1;
		
		System.out.println("N\tN*10\tN*100\tN*1000");

		while (x <= 5)
		{
			int ten = (x * 10);
			int hundred = (x * 100);
			int thousand = (x * 1000);
			
			System.out.printf("%d\t%d\t%d\t%d%n", x, ten, hundred, thousand);
			x += 1;
		}
		
	}
}