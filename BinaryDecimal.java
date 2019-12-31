import java.util.Scanner;

public class BinaryDecimal{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);

		int decNum= 0;
		int counter = 0;
		int result = 1;

		System.out.print("Enter binary here: ");
		int num = input.nextInt();		

		while (num > 0){
			if (counter == 0){
				result = 1;
			} else {
				result *= 2;
			}
			int value = num % 10;
			num = num / 10;
			decNum += (value * result);
			++counter;
		}
		System.out.println("The binary equivalent is " + decNum);
	}
}