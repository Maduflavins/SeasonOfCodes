import java.util.Scanner;

public class Arismalla{
	public static void main(String[] args){
	
		Scanner input = new Scanner (System.in);
		
		System.out.println("Pick a first number: ");
		int a = input.nextInt();

		System.out.println("Pick a second number: ");
		int b = input.nextInt();

		System.out.println("Pick a third number: ");
		int c = input.nextInt();

		int x = a + b + c;
		int y = x / 3;
		int z = a * b * c;

		System.out.printf("Sum is: %d%nAverage is: %d%nAnd product is: %d%n", x, y, z);

		if (b > a && a < c){
			System.out.printf("%d is the smallest", a);
		}
		if (a > b && b < c){
			System.out.printf("%d is the smallest", b);
		}
		if (a > c && c < b){
			System.out.printf("%d is the smallest", c);
		}

		if (b < a && a > c){
			System.out.printf("%nwhile %d is the largest", a);
		}
		if (a < b && b > c){
			System.out.printf("%nwhile %d is the largest", b);
		}
		if (a < c && c > b){
			System.out.printf("%nwhile %d is the largest", c);
		}
	}
}
