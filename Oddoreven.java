import java.util.Scanner;

public class Oddoreven{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);

		System.out.println("Enter a number");
		int x = input.nextInt();

		int res = x % 2;

		if (res == 0){
			System.out.printf("%d is an even number", x);
		}
		if (res != 0){
			System.out.printf("%d is an odd number", x);
		}
	}
}
