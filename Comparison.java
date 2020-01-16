
//Comparison.java
//Compare integers using if statements
//
import java.util.Scanner;

public class Comparison{
	
	public static void main(String[] args){ //from here to line 41 begins the execution of the program

	Scanner input = new Scanner(System.in); //declaring Scanner for keyboard entry
//11 taking entry from the user. Ln13 and 16 prompt the user
	System.out.print("Enter first integer: ");
	int number1 = input.nextInt();
//14
	System.out.print("Enter second integer: ");
	int number2 = input.nextInt();
//17
	if (number1 == number2){
		System.out.printf("%d == %d%n", number1, number2);
		}
//21
	if (number1 != number2){
		System.out.printf("%d != %d%n", number1, number2);			
		}
//25
	if (number1 < number2){
		System.out.printf("%d < %d%n", number1, number2);
		}
//29
	if (number1 > number2){
		System.out.printf("%d > %d%n", number1, number2);
		}
//33
	if (number1 <= number2){
		System.out.printf("%d <= %d%n", number1, number2);
		}
//37
	if (number1 >= number2){
		System.out.printf("%d >= %d%n", number1, number2);
		}
	}
}

