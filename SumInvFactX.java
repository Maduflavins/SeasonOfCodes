public class SumInvFactX{
	public static void main (String[] args){

		double total = 0;
		int i = 1;
		int x = 1;

		while (i <= 5){
			double fact = 1;
			double invFact = 0;
			int j = 1;

			while (j <= i){
				fact *= j;
				invFact = (1/fact);
				j++;
			

		while (i <= 5){
			if (i == 0){
				x = 1;
			} else {
				x *= x;
			}
		}
			total += (x / invFact);
			i++;
		}
}
		System.out.printf("x / Inverse Sum is %.2f", total);
	}
}