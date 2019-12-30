public class DateTest{
	public static void main(String[] args){
		Date today = new Date(12, 16, 2019);
		Date yesterday = new Date(12, 17, 2019);
		Date tomorrow = new Date(12, 18, 2019);
		Date dob = new Date(8, 20, 1989);
		
		today.displayDate();
		yesterday.displayDate();
		tomorrow.displayDate();
		dob.displayDate();

		System.out.println("Month: " + today.getMonth());

              	System.out.println("Day: " + today.getDay());

             	System.out.println("Year: " + today.getYear());

		//System.out.println(today.setMonth(11));
	}

}