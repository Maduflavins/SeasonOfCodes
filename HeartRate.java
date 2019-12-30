public class HeartRate{
	private String firstName;
	private String lastName;
	private int month;
	private int day;
	private int year;

	public HeartRate(String firstName, String lastName, int month, int day, int year){
		this.firstName = firstName;
		this.lastName = lastName;
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public int calculateAge(int year){
		int age = (2019 - year);
		return age;
	}

	public int MaximumHeartRate(int year){
		int heartRate = (220 - (2019 - year));
		return heartRate;
	}

	public double targetHeartRateA(int year){
		double targetRateA = 0.50 * (220 - (2019 - year));
		return targetRateA;
	}

	public double targetHeartRateB(int year){
		double targetRateB = 0.85 * (220 - (2019 - year));
		return targetRateB;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getLastName(){
		return lastName;
	}

	public void setMonth(int month){
		this.month = month;
	}
	public int getMonth(){
		return month;
	}

	public void setDay(int day){
		this.day = day;
	}
	public int getDay(){
		return day;
	}

	public void setYear(int year){
		this.year = year;
	}
	public int getYear(){
		return year;
	}
}