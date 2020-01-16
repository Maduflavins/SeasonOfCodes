import java.util.Scanner;

public class Largesmall{
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

		int largest = a;
		int smallest = a;

		if (b < smallest){
			smallest = b;
		}
		if (c < smallest){
			smallest = c;
		}
		if (b > largest){
			b = largest;
		}
		if (c > largest);
			c = largest;
		}

		System.out.printf("The smallest number is %d%nand the highest number is %d", smallest, largest);


	}
}
