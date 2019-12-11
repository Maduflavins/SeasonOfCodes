import java.util.Scanner;
public class OddOrEven{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("please enter any inter number: ");
		int number = input.nextInt();
		if(number % 2 ==0){
			System.out.printf("your number %d is an even number", number);
		}
		if(number % 2 !=0){
			System.out.printf("Your number %d is an odd number", number);
		}
		
		
	}
}
