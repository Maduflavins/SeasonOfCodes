import java.util.Scanner;

public class SecondLargest{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);

		int counter = 0;
		int largest = 0;
		int secondLargest = 0;

		while (counter <= 10){
			System.out.print("Enter number: ");
			int num = input.nextInt();

			if (num > largest){
				secondLargest = largest;
				largest = num;
			}

			if (num < largest){
				if (num > secondLargest){
					secondLargest = num;
				}
			}	
	
			System.out.printf("Largest number so far %d%n", largest);
			System.out.printf("Second largest number so far %d%n%n", secondLargest);
			counter += 1;
		}
		System.out.printf("The largest number of the lot is: %d%n", largest);
		System.out.printf("The second largest number of the lot is: %d", secondLargest);
	}

}