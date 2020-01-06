public class Scope
{
	private static int x = 1;

	//method main creates and initialises local variable x
	//and calls methods useLocalVariable and useField
	public static void main (String[] args)
	{
		int x = 5; //method's local variable x shadows field x

		System.out.printf("local x in main is %d%n", x);

		useLocalVariable(); // useLocalVariable has local x
		useField(); //useField uses Scope's field x
		useLocalVariable(); // useLocalVariable reinitialises local x
		useField(); // class Scope's field x retains its value
		//useLocalVariable();
		//useField();

		System.out.printf("%nLocal x in main is %d%n", x);
	}

	public static void useLocalVariable()
	{
		int x = 25; //28initialised each time useLocalVariable is called

		System.out.printf("%nlocal x on entering methos useLocalVariable is %d%n", x);
		++x; // modified x in the local variable x
		System.out.printf("local x before exiting method useLocalVariable is %d%n", x);
	}

	public static void useField()
	{
		System.out.printf("%nfield on entering method useField is %d%n", x);
		x*= 10; // modifies class scope's field x
		System.out.printf("field x before exitind method useField is %d%n", x);
	}
}