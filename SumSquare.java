public class SumSquare{
	public static void main (String[] args){
		
		int sum = 0;

		for (int i = 1; i <= 10; i++){
			int square = (i * i);
			sum += square;
			System.out.printf("%d square = %d%n", i, square);
		}
		System.out.println();
		System.out.printf("The sum of the first ten squares is " + sum);
	}
}