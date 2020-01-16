import java.util.Scanner;

public class Multiples{
	public static void main (String[] args){

		Scanner input = new Scanner (System.in);
	
		System.out.println("Enter a number: ");
		int x = input.nextInt();

		System.out.println("Enter a second number: ");
		int y = input.nextInt();

		int a = x % y;
	
		if (a == 0){
			System.out.printf("%d is a multiple of %d", y, x);
		}
		if (a != 0){
			System.out.printf("%d is not multiple of %d", y, x);
		}

	}
}
