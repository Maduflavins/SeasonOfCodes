import java.util.Scanner;
public class SalesCommission{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		
		int  salesCounter = 0;
		double totalEarning = 0;
		int firstItem = 0;
		int secondItem = 0;
		int thirdItem = 0;
		int fourthItem = 0;
		
		System.out.println("Please enter item sold 1, 2, 3, 4, or -1 to quit: ");
		int item = input.nextInt();
		while(item != -1){
			if(item == 1){
				totalEarning = 0.09 * 239.99 + (double) 200;
				firstItem++;
				
			}
			else if(item == 2){
				totalEarning = 0.09 * 129.75 +(double) 200;
				secondItem++;
			}
			else if(item == 3){
				totalEarning = 0.09 * 99.95 + (double)200;
				thirdItem++;
			}
			else if(item == 4){
				totalEarning = 0.09 * 350.89 +(double) 200;
				fourthItem++;
			}
			System.out.println("please enter item no sold; 1, 2, 3, 4 or -1 to quit: ");
			item = input.nextInt();

			salesCounter++;
		}
		System.out.printf("total sales %d, item 1:%d, item2:%d, item3:%d, item4:%d, totalEarning:%.2f", salesCounter, firstItem, secondItem, thirdItem, fourthItem, totalEarning);
		

	}
}
