import java.util.Scanner;
public class Diameter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please an inter to represent the radius of a circle: ");
		int r = input.nextInt();
		System.out.printf("diameter: %d, circumference: %f, area: %f", 2 *r, 2*Math.PI*r, Math.PI*r*r);
		
	}
}
