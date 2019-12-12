import java.util.Scanner;

public class Populationgrowth{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.println("What is the world population now?: ");
		double pop = input.nextDouble();

		System.out.println("At what percentage of growth rate?: ");
		double rt = input.nextDouble();
		rt = rt / 100;

		System.out.println("The world\'s estimated population is: " + pop);
		System.out.println("And The estimated growth rate is: " + rt);

		double yr1 = pop + (pop * rt);
		System.out.println("First year population is: " + yr1);
		pop = yr1;

		double yr2 = pop + (pop * rt);
		System.out.println("Second year population is: " + yr2);
		pop = yr2;

		double yr3 = pop + (pop * rt);
		System.out.println("Third year population is: " + yr3);
		pop = yr3;

		double yr4 = pop + (pop * rt);
		System.out.println("Fourth year population is: " + yr4);
		pop = yr4;

		double yr5 = pop + (pop * rt);
		System.out.println("Fifth year population is: " + yr5);				
	}
}
