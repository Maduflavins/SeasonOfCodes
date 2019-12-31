public class DanglingElse{
	public static void main (String[] args){

		int x = 11;
		int y = 9;

		if (x < 10)
			if (y > 10)
				System.out.println("*****");
			else
				System.out.println("#####");
				System.out.println("$$$$$");
//b) 
		if (x < 10)
		{
			if (y > 10)
				System.out.println("*****");
			}
			else
			{
				System.out.println("#####");
				System.out.println("$$$$$");
		}
	}
}

/*C:\Users\user\Desktop>java DanglingElse
*****
$$$$$
*****

C:\Users\user\Desktop>javac DanglingElse.java

C:\Users\user\Desktop>java DanglingElse
$$$$$
#####
$$$$$

C:\Users\user\Desktop>*/