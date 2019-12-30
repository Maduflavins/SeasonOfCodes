public class Date{
	private int month;
	private int day;
	private int year;

	public Date(int month, int day, int year){
		if (month > 0 && month < 13){
			this.month = month;
		}
		if (day > 0 && day < 32){
			this.day = day;
		}
		if (year > 1900 && year < 2020){
			this.year = year;
		}
	}
	public void displayDate(){
		System.out.println("The requested date is: " + month + "/" + day + "/" + year);
	}	
	//Set methods
	public void setMonth(int month){
		if (month > 0 && month < 13){
			this.month = month;
		}
	}
	public void setDay(int day){
		if (day > 0 && day < 32){
			this.day = day;
		}
	}
	public void setYear(int year){
		if (year > 1900 && year < 2020){
			this.year = year;
		}
	}
	//Get Methods
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	public int getYear(){
		return year;
	}
}
