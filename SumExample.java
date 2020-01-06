public class SumExample{
	public static void main (String[] args){
		int total = 0;
	
		for (int n = 0; n <= 20; n += 2)
			total += n;
		System.out.printf("Sum is %d%n", total);
	}
}