import java.time.Year;
public class HealthProfile{
	private  String firstName;
	private String lastName;
	private String gender;
	private int month;
	private int day;
	private int year;
	private double height;
	private double weight;

	public HealthProfile(String firstName, String lastName, String gender, int month, int day, int year, double height, double weight ){
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.month = month;
		this.day = day;
		this.year = year;
		this.height = height;
		this.weight = weight;
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
	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public void setDay(int day){
		if((day < 0 )|| (day > 31)){
			System.out.println("Invalid input");
		}else{
			this.day = day;
		}
	}
	public int getDay(){
		return day;
	}
	public void setMonth(int month){
		if((month < 0) || (month > 12)){
			System.out.println("Month is not set");
		}
		else{
			this.month = month;
		}
	}
	public int getMonth(){
		return month;
	}
	public void setYear(int year){
		if(year < 0 || year > Year.now().getValue()){
			System.out.println("Your entery is wrong:");
			
		}
		else{
			this.year = year;
		}
	
	}
	public int getYear(){
		return year;
	}
	public void setHeight(double height){
		if(height < 0){
			System.out.println("Invalid entry");
		}else{
			this.height = height;
		}
	}
	public double getHeight(){
		return height;
	}
	public void setWeight(double weight){
		if(weight < 0){
			System.out.println("Weight is not set");
		}else{
			this.weight = weight;
		}
	}
	public double getWeight(){
		return weight;
	}
	public int calAge(){
		return Year.now().getValue() - getYear();
	}
	public double calBMI(){
	double BMI = (getWeight() * 703) / (getHeight() * getHeight());
	return BMI;
	}
	public double calMaxHeartRate(){
		int maxHeartRate = 220 - calAge(); 
		return maxHeartRate;
	}
	
	public double minTarget(){
		return calMaxHeartRate() * 0.5;
	}
	public double maxTarget(){
		return calMaxHeartRate() * 0.85;
	}
	public void displayBirthDate(){
		System.out.printf("%d : %d : %d", getMonth(), getDay(), getYear());
	}
}
