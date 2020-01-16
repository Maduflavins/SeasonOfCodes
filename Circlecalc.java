import java.util.Scanner;

public class Circlecalc{
	public static void main(String[] args){
		
		double pi = 3.14;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a value for radius of circle: ");
		int r = input.nextInt();
		
		System.out.println("The diameter of the circle is: " + (2 * r) + ", the circumference is " + (2 * pi * r) + ", while the area of this circle is " + (pi * r * r));
	}
}
