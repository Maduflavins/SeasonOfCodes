import java.util.Scanner;
public class Palindromes{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter five digits: ");
		int digits = input.nextInt();
		if(digits / 1000 == 0){
			System.out.println("Your digits is lower than 5 digits");
		}
		if(digits / 100000 != 0){
			System.out.println("Your digits are greater than five digits");
		}
		if(digits / 10000 >= 1){
			int num1 = digits/10000;
			int num2 = (digits %10000)/1000;
			int num3 = (digits % 1000) / 100;
			int num4 = (digits % 100) / 10;
			int num5 = (digits % 10) / 1;
			if(num1 == num5 && num2 == num4){
				System.out.printf("%d is a palindrom", digits);
			}else{
				System.out.printf("%d is not a palindrom", digits);
			}
		}
		
	}	
}
