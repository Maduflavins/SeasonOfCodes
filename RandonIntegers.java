//Write statements that assign random integers to the variable n in the following ranges:
//a) 1 ≤ n ≤ 2.
//b) 1 ≤ n ≤ 100.
//c) 0 ≤ n ≤ 9.
//d) 1000 ≤ n ≤ 1112.
//e) –1 ≤ n ≤ 1.
//f) –3 ≤ n ≤ 11.

import java.security.SecureRandom;

public class RandonIntegers
{
	public static final SecureRandom randomNumber = new SecureRandom();

	public static void main (String[] args)
	{
		System.out.print(1 + randomNumber.nextInt(2));
		System.out.println();
		System.out.print(1 + randomNumber.nextInt(100));
		System.out.println();
		System.out.print(randomNumber.nextInt(10));
		System.out.println();
		System.out.print(1000 + randomNumber.nextInt(113));
		System.out.println();
		System.out.print(-1 + randomNumber.nextInt(3));
		System.out.println();
		System.out.print(-3 + randomNumber.nextInt(15));
	}
}