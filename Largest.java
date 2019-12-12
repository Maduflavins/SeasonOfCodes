import java.util.Scanner;

public class Largest{
	public static void main(String[] args){
		System.out.println("Enter first number: ");
		Scanner input = new Scanner (System.in);
		int firstNumber = input.nextInt();

		System.out.println("Enter second number: ");
		int secondNumber = input.nextInt();

		System.out.println("Enter third number:" );
		int thirdNumber = input.nextInt();

		int largest = firstNumber;

		if (secondNumber > largest){
			largest = secondNumber;
		}
		if (thirdNumber > largest){
			largest = thirdNumber;
		}

		System.out.printf("The largest number is %d", largest);
	}
}