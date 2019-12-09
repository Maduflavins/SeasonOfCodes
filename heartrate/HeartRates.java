import java.time.Year;
public class HeartRates{
	private String firstName;
	private String lastName;
	private int day;
	private int month;
	private int year;
	public HeartRates(String firstName, String lastName, int day, int month, int year){
		this.firstName = firstName;
		this.lastName = lastName;
		this.day = day;
		this.month = month;
		this.year = year;
		
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

	public void setDay(int day){
		this.day = day;
	}
	public int getDay(){
		return day;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public int getMonth(){
		return month;
	}
	public void setYear(int year){
		this.year = year;
	}
	public int getYear(){
		return year;
	}
	public int calcAge(){
		int age;
		if(getYear() > year){
			return -1;
		}else{
			age = Year.now().getValue() - getYear();
		}
		return age;
	}
	public int maxHeartRate(){
		int maxHeartRate;
		if(getYear() > Year.now().getValue()){
			return -1;
		}else{
			maxHeartRate = 220 - calcAge();
			
		}
		return maxHeartRate;
	}
	public double lowTarget(){
		double lowTarget;
		if(getYear() > Year.now().getValue()){
			lowTarget = -1;
		}else{
			lowTarget = 0.5 * maxHeartRate();
		}
		return lowTarget;
		
	}
	public double highTarget(){
		double highTarget;
		if(getYear() > Year.now().getValue()){
			highTarget = -1;
		}else{
			highTarget = 0.85 * maxHeartRate();
		}
		return highTarget;
	}
}
