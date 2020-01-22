public class SixSeven
{
	public static void main (String[] args)
	{
		double x, a, b, c, d, e, f;

		x = Math.abs(7.5);
		a = Math.floor(7.5);
		b = Math.abs(0.0);
		c = Math.ceil(0.0);
		d = Math.abs(-6.4);
		e = Math.ceil(-6.4);
		f = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));

		System.out.println(x);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}

/*
C:\Users\user\Desktop>java SixSeven
7.5
7.0
0.0
0.0
6.4
-6.0
-14.0
*/