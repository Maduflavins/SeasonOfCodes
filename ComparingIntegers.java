import java.util.Scanner;

public class ComparingIntegers{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);

		System.out.println("Pick a number: ");
		int a = input.nextInt();

		System.out.println("Pick another number: ");
		int b = input.nextInt();

		if (a > b){
			System.out.printf("%d is larger", a);
		}
		if (b > a){
			System.out.printf("%d is larger", b);
		}
	}
}