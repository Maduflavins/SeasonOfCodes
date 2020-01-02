public class PrintAsterisks{
	public static void main (String[] args){

		int k = 1;

		while (k <= 4){
			for (int i = 1; i <= 10; i++){
				System.out.print("* ");
			}
			System.out.println();
			for (int j = 1; j <= 10; j++){
				System.out.print(" *");
			}
			System.out.println();
			k++;
		}
	}
}