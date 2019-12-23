import java.util.Scanner;
public class LargestNumber{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int counter = 1;
	int largest = 0;
	while(counter < 11){
		System.out.println("Please enter first no: ");
		int firstNo = input.nextInt();
		if(firstNo > largest){
			largest = firstNo;
		}
		counter++;

	}
	System.out.println(largest);
		
	}
	
}
