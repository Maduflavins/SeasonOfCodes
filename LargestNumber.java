import java.util.Scanner;

public class LargestNumber{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);

		int counter = 1;
		int largest = 0;
		//int secondLargest = 0;

		while (counter <= 10){
			System.out.print("Enter number: ");
			int num = input.nextInt();
			if (num > largest){
				largest = num;
			}
			else {
				largest = largest;
			}
			System.out.printf("Largest number so far %d%n%n", largest);
			counter += 1;
		}
		System.out.printf("The largest number of the lot is: %d", largest);
	}

}