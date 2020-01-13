//5.33 (Facebook User Base Growth) According to CNNMoney.com, Facebook hit one billion users
//in October 2012. Using the compound-growth technique you learned in Fig. 5.6 and assuming
//its user base grows at a rate of 4% per month, how many months will it take for Facebook to grow
//its user base to 1.5 billion users? How many months will it take for Facebook to grow its user base
//to two billion users?

public class Facebook
{
	public static void main (String[] args)
	{
		double userBase = 1000000000;
		double newUserBase = 1;
		double growthRate = 0.04;
		

		System.out.printf("%s%20s%n", "Month", "New Population");

		for (int month = 1; month <= 18; month++)
		{
			newUserBase = userBase * Math.pow(1.00 + growthRate, month);
			System.out.printf("%3d%,23.2f%n", month, newUserBase);
		}
	}
}

//About 11 months to hit the 1.5 Billion mark
//and about 24 months to get t0 2 Billion users