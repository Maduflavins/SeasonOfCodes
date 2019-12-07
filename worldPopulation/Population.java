import java.util.Scanner;

public class Population{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("What do you think is the world population: ");
		long population = input.nextLong();
		System.out.println("At what rate do you think we are growing");
		long growth = input.nextLong();
		double rate = (double) growth / 1000;
		long firstYear = (long) rate * population;
		long secondYear = 2 * firstYear;
		long thirdYear = 3 * firstYear;
		System.out.printf("%d%n%d%n%d%n", firstYear, secondYear, thirdYear);
		

	}
}
