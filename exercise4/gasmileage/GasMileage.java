import java.util.Scanner;
public class GasMileage{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int tripCounter = 0;
		int totalMiles = 0;
		int totalGallon = 0;
		System.out.println("Please enter Miles tralvelled and -1 to quit: ");
		int miles = input.nextInt();
		System.out.println("Please enter No of gallons or -1 too quit: ");
		int gallon = input.nextInt();
		while((miles != -1) || (gallon != -1)){
			double averageMilesPerGallon = (double) miles/gallon;
			System.out.printf("Average miles per gallon for your trip is %.2f", averageMilesPerGallon);
			totalMiles += miles;
			totalGallon += gallon;
			tripCounter = tripCounter + 1;
			System.out.println("Please enter Miles tralvelled and -1 to quit: ");
			miles = input.nextInt();
			System.out.println("Please enter No of gallons or -1 too quit: ");
			gallon = input.nextInt();
			
		}
		if(tripCounter != 0){
			double TotalMilesPergallon = (double) totalMiles / totalGallon;
			System.out.printf("the total average miles per gallon is %.2f", TotalMilesPergallon);
		}else{
			System.out.println("No valid entry");
		}

	
	
	
	
	}
}
