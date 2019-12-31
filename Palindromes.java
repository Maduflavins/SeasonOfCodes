import java.util.Scanner;

public class Palindromes{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		
		int a, b, c, d;

		System.out.print("Please enter number: ");
		int num = input.nextInt();

		while (num / 10000 == 0){
			System.out.println("The number you entered is less than 5 figures.");
			System.out.print("Enter a new figure: ");
			num = input.nextInt();
		}

		a = (num / 10000);
		b = (num % 10000) / 1000;
		c = (num % 100) / 10;
		d = (num % 10) / 1;

		if (a == d){
			if (b == c)
				System.out.println("The number is a palindrome.");
			else if (b != c){
				System.out.println("The number is not a palindrome.");
			}
		}
	}
}
