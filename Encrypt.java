import java.util.Scanner;

public class Encrypt{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);

		int a, b, c, d, newA, newB, newC, newD;

		System.out.print("Enter a four-figure passcode: ");
		int num = input.nextInt();
		
		if (num % 1000 == 0){
			System.out.println("This is not a four-figure number");
		}
	
		a = ((num / 1000) + 7) % 10;
		c = (((num / 10) % 10) + 7) % 10;
		b = (((num / 100) % 10) + 7) % 10;
		d =  ((num % 10) + 7) % 10;

		System.out.printf("a %d%n", a);
		System.out.printf("b %d%n", b);
		System.out.printf("c %d%n", c);
		System.out.printf("d %d%n", d);

		/*String strNum = c + "" + a + "" + d + "" + b;
		int intNum = Integer.parseInt(strNum);
		System.out.printf("Encrypted is %d", intNum);

		newA = a * 100;
		newB = b * 1;
		newC = c * 1000;
		newD = d * 10;

		int newNum = c + a + d + b;*/

		System.out.printf("the passcode initially is %d%d%d%d%n", a,b,c,d);
		System.out.printf("Encrytped is %d%d%d%d", c,a,d,b);
		//System.out.printf("The Encrypted value is " + newNum);
		
	}
}