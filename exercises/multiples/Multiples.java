import java.util.Scanner;
public class Multiples{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first integer Number: ");
		int firstNumber = input.nextInt();
		System.out.println("Please enter second integer Number: ");
		int secondNumber = input.nextInt();
		if(secondNumber % firstNumber == 0){
			System.out.printf("your first number %d is a multiple of %d the second number", firstNumber, secondNumber);
		}
		if(secondNumber % firstNumber != 0){
			System.out.printf("Your first number %d is not a multipple of the second number %d", firstNumber, secondNumber);
		}
	}
}
