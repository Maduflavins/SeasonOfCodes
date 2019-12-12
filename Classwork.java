/*Write a code that takes three numbers, 
add the first two numbers.
If the result is greater than the third, 
print result.
Else if the third number is greater than the result, 
print third number.

Pseudocode
Ask for first number
Collect first number
Save first number
Ask for second number
Collect second number
Save second number
Ask for third number
Collect third number
Save third number
Add first number to second number
Save result
If result is greater than third number
print result
If result is less than third number
Print third number*/

import java.util.Scanner;

public class Classwork{
	public static void main(String[] args){
		System.out.println("Enter first number: ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();

		System.out.println("Enter second number: ");
		int num2 = input.nextInt();
	
		System.out.println("Enter third number: ");
		int num3 = input.nextInt();

		int result = num1 + num2;

		if (result > num3){
			System.out.printf("The addition of the first two  numbers is: %d", result);
		}
		if (result < num3){
			System.out.printf("The third number is %d", num3);
		}

	}
}