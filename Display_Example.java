import java.util.Scanner;

public class Display_Example{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter a number: ");
		int num1 = input.nextInt();

		if (num1 != 7){
			System.out.println("The variable number is not equal to 7");
		}
	}
}
