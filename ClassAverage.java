import java.util.Scanner;

public class ClassAverage{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int total = 0;
		int gradeCounter = 1;
		
		while (gradeCounter <= 10){
			System.out.print("Enter grade: ");
			int grade = input.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1;
		}
		
		System.out.printf("Total of class grades =  %s%n", total);
		int average = (total / 10);
		System.out.printf("The average is: %d%n", average);
	}
}