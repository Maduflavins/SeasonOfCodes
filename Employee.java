public class Employee{
	private String firstName;
	private String lastName;
	private double monthlySalary;

	public Employee(String firstName, String lastName, double monthlySalary){
		this.firstName = firstName;
		this.lastName = lastName;
		if (monthlySalary > 0.0){
			this.monthlySalary = monthlySalary;
		}
	}

	//Method for annual salary
	public double getAnnualSalary(){
		return monthlySalary * 12;
	}
	public double getNewSalary(){
		return monthlySalary * 1.1;
	}
	public double getNewAnnualSalary(){
		return monthlySalary * 12 * 1.1;
	}

	//Set Methods
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setMonthlySalary(double monthlySalary){
		this.monthlySalary = monthlySalary;
	}

	//Get methods
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public double getMonthlySalary(){
		return monthlySalary;
	}
}