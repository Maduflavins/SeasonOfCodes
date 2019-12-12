
import java.util.Scanner;

public class Largestposition{
	public static void main(String[] args){
		System.out.println("Enter first number: ");
		Scanner input = new Scanner (System.in);
		int firstNumber = input.nextInt();

		System.out.println("Enter second number: ");
		int secondNumber = input.nextInt();

		System.out.println("Enter third number:" );
		int thirdNumber = input.nextInt();

		int largest = 0;
		int position = 0;

		if (firstNumber > largest){
			largest = firstNumber;
			position = 1;
		}
		if (secondNumber > largest){
			largest = secondNumber;
			position = position + 1;
		}
		if (thirdNumber > largest){
			largest = thirdNumber;
			position = position + 1;
		}

		System.out.printf("The largest number is %d and is in position %d", largest, position);
	}
}