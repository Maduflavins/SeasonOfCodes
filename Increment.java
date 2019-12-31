public class Increment{
	public static void main (String[] args){
		int c = 5;
		System.out.printf("c before postincrement: %d%n", c);
		System.out.printf("    postincrementing c (c++): %d%n", c++);
		System.out.printf(" c after postincrement: %d%n", c);

		System.out.println();

		//demonstratiing prefic increment operator
		c = 5;
		System.out.printf("c before preincrement: %d%n", c);
		System.out.printf("    preincrementing c (++c): %d%n", ++c);
		System.out.printf(" c after preincrement: %d%n", c);
	}
}