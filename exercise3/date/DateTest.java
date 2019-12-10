import java.util.Scanner;
public class DateTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Month:");
		int month = input.nextInt();
		System.out.println("Please enter day: ");
		int day = input.nextInt();
		System.out.println("pleae enter year: ");
		int year = input.nextInt();
		Date date = new Date(month, day, year);
		date.setMonth(month);
		date.setDay(day);
		date.setYear(year);
		date.displayYear();	
		
	}
	
}
