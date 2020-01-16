//Exercise Number 5
//Program to calculate the product of three numbers

import java.util.Scanner;

public class ThreeCalc {
	public static void main (String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first integer: ");		
		int x = input.nextInt();
	
		System.out.println("Enter the second integer: ");
		int y = input.nextInt();

		System.out.println("Now enter the third integer: ");
		int z = input.nextInt();

		int result = x * y * z;
		System.out.printf("Product is %d: ", result);
	
	}
}