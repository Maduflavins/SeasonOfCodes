public class OddProduct{
	public static void main (String[] args){
		
		long total = 1;

		for (int i = 1; i <= 15; i += 2)
		{
			total *= i;
		System.out.printf("%d ", i);
		}
		System.out.println();
		System.out.printf("The product is " + total);
	}
}