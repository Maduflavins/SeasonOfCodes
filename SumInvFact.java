public class SumInvFact{
	public static void main (String[] args){

		double total = 0;
		int i = 1;

		while (i <= 5){
			double fact = 1;
			double invFact = 0;
			int j = 1;

			while (j <= i){
				fact *= j;
				invFact = (1/fact);
				j++;
			}
			total += invFact;
			i++;
		}
		System.out.printf("Inverse Sum is %.2f", total);
	}
}