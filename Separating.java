import java.util.Scanner;

public class Separating{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		int res1, res2, res3, res4, res5;
		
		System.out.println("Please enter a 5-figure number: ");
		int num = input.nextInt();

		if (num / 10000 == 0){
			System.out.println("The number you entered is less than 5 figures.");
		}
		if (num / 100000 >= 10){
			System.out.println("The number you entered is more than 5 figures!");
		}
		if (num / 10000 >= 1){
		res1 = (num / 10000);
		res2 = (num % 10000) / 1000;
		res3 = (num % 1000) / 100;
		res4 = (num % 100) / 10;
		res5 = (num % 10) / 1;
		System.out.printf("%d   %d   %d   %d   %d", res1, res2, res3, res4, res5);
		}
	}	
}
