public class EmployeeTest{
	public static void main(String[] args){
		Employee worker1 = new Employee("Qoyum", "Yussuff", 720000);
		Employee worker2 = new Employee("Ihediora", "Victor", 840000);

		System.out.printf("%s %s's monthly salary = %.2fNGN and his annual income = %.2fNGN%n", worker1.getFirstName(), worker1.getLastName(), worker1.getMonthlySalary(), worker1.getAnnualSalary());

		System.out.printf("%s %s's monthly salary = %.2fNGN and his annual income = %.2fNGN%n", worker2.getFirstName(), worker2.getLastName(), worker2.getMonthlySalary(), worker2.getAnnualSalary());

		System.out.printf("%s %s's monthly salary has been reviewed to %.2fNGN and his annual income is now %.2fNGN%n", worker1.getFirstName(), worker1.getLastName(), worker1.getNewSalary(), worker1.getNewAnnualSalary());

		System.out.printf("%s %s's monthly salary has been reviewed to %.2fNGN and his annual income is now %.2fNGN%n", worker2.getFirstName(), worker2.getLastName(), worker2.getNewSalary(), worker2.getNewAnnualSalary());
	}
}