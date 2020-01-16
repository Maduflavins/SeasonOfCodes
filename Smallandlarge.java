import java.util.Scanner;

public class Smallandlarge{
	public static void main(String[] args){
	
		System.out.println("Enter the first number: ");
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();

		System.out.println("Enter the second number: ");
		int b = input.nextInt();

		System.out.println("Enter the third number: ");
		int c = input.nextInt();

		int x = (a + b + c);
		int y = x / 3;
		int z = a * b * c;

		int largest = 0;
		int smallest = a;

		if (a > largest){
			largest = a;
		}
		if (b > largest){
			largest = b;
		}
		if (c > largest){
			largest = c;
		}
		if (b < smallest){
			smallest = b;
		}
		if (c < smallest){
			smallest = c;
		}
		
		System.out.printf("The sum of the three numbers is %d%nThe average of the three numbers is %d%nThe product of the three numbers is %d%nWhile the largest number is %d%nAnd the smallest number is %d", x, y, z, largest, smallest);
	}
}
