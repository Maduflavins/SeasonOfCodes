import java.util.Scanner;

public class Largesmallfive{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);

		System.out.println("Enter first number: ");
		int num1 = input.nextInt();

		System.out.println("Enter second number: ");
		int num2 = input.nextInt();

		System.out.println("Enter third number: ");
		int num3 = input.nextInt();

		System.out.println("Enter fourth number: ");
		int num4 = input.nextInt();

		System.out.println("Enter fifth number: ");
		int num5 = input.nextInt();

		int most = num1;
		int least = num1;

		if (num2 > most){
			most = num2;
		}
		if (num3 > most){
			most = num3;
		}
		if (num4 > most){
			most = num4;
		}
		if (num5 > most){
			most = num5;
		}

		if (num2 < least){
			least = num2;
		}
		if (num3 < least){
			least = num3;
		}
		if (num4 < least){
			least = num4;
		}
		if (num5 < least){
			least = num5;
		}

		

		System.out.printf("The highest number is: %d%nand the least is: %d", most, least);
}
}
