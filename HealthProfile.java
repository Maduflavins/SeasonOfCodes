public class HealthProfile{
	private String firstName;
	private String lastName;
	private int gender;
	private int month;
	private int day;
	private int year;
	private double height;
	private double weight;

	public HealthProfile(String firstName, String lastName, int gender, int month, int day, int year, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.month = month;
		this.day = day;
		this.year = year;
		this.height = height;
		this.weight = weight;
	}

	//Method to return gender
	public int obtainGender(int gender){
		if (gender == 1){
			System.out.println("male");
		}
		if (gender == 2){
			System.out.println("female");
		}
		return gender;
	}
	
	//Method to calculate and return Age
	public int calculateAge(int year){
		int age = (2019 - year);
		return age;
	}

	//Method to calculate and return Maximum Heart Rate
	public int getMaxHeartRate(int year){
		int heartRate = (220 - (2019 - year));
		return heartRate;
	}

	//Methods to calculate and get Target Heart Rate
	public double targetHeartRateA(int year){
		double targetRateA = 0.50 * (220 - (2019 - year));
		return targetRateA;
	}

	public double targetHeartRateB(int year){
		double targetRateB = 0.85 * (220 - (2019 - year));
		return targetRateB;
	}

	//Method to calculate the Body Mass Index
	public double getBodyMassIndex(double height, double weight){
		return (weight / (height * height));
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

	public void setHeight(double height){
		this.height = height;
	}
	public double getHeight(){
		return height;
	}

	public void setWeight(double weight){
		this.weight = weight;
	}
	public double getWeight(){
		return weight;
	}

	public void setGender(int gender){
		this.gender = gender;
	}
	public int getGender(){
		return gender;
	}

}