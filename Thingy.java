import java.util.Scanner;

public class Thingy{
	public static void main(String[] args){	
		Scanner input = new Scanner(System.in);

		int sum = 0;
		int x = 1;

		while (x < 10){
			System.out.print("Enter number: ");
			int num = input.nextInt();
			sum = sum + num;
			x += 1;
		}
		System.out.printf("Sum is %d", sum);
	}
}