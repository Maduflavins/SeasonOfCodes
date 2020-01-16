import java.util.Scanner;

public class Weightcalc{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Kindly enter your weight (in Kilograms): ");
		int weightinKilograms = input.nextInt();

		//System.out.println("Type 1 for weight in P and 2 for weight in Kg: ");
		//int unit = input.nextInt();

		System.out.println("Kindly enter your height (in metres): ");
		double heightInMeters = input.nextDouble();

		//int bmi1 = (weight * 703) / (height * height);
		double bmi = weightinKilograms / (heightInMeters * heightInMeters);

		System.out.printf("Your Body Mass Index is: %f%n", bmi);
				
		//BMI VALUES
		if (bmi < 18.5){
			System.out.println("You may be a bit Underweight. Please eat better and rest much better.");
		}
		if (18.5 < bmi && bmi < 24.9){
			System.out.println("You have a seemingly normal weight. Keep up the good work");
		}
		if (24.9 < bmi && bmi < 29.9){
			System.out.println("You appear to be overweight. Consider losing some weight.");
		}
		if (bmi >= 30){
			System.out.println("You are obese. You urgently need to shed an appreciable amount of weight");
		}
	}
}
