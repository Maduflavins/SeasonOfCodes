public class MthOvld
{
	public static void main (String[] args)
	{
		System.out.println(square(7, 3));
		System.out.println(square(5.0, 3.0));
	}

	public static int square(int a, int b)
	{
		return a * b;
	}
	public static double square(double a, double b)
	{
		return a * b;
	}
}