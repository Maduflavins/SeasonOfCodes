import java.util.Scanner;
public class EmployeeTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String fname = input.nextLine();
		System.out.println("Please enter your last Name: ");
		String lname = input.nextLine();
		System.out.println("Please enter your monthly Salary: ");
		double monthlyPay = input.nextDouble();
		
		Employee employee1 = new Employee(fname, lname, monthlyPay);
		employee1.setFirstName(fname);
		employee1.setLastName(lname);
		employee1.setMonthlySalary(monthlyPay);
		double annualSalary1 = employee1.getMonthlySalary() * 12;


		
		System.out.println("Please enter your first name: ");
		String fname2 = input.nextLine();
		System.out.println("Please enter your last Name: ");
		String lname2 = input.nextLine();
		System.out.println("Please enter your monthly Salary: ");
		double monthlyPay2 = input.nextDouble();
		
		
		Employee employee2 = new Employee(fname2, lname2, monthlyPay2);
		employee2.setFirstName(fname2);
		employee2.setLastName(lname2);
		employee2.setMonthlySalary(monthlyPay2);
		double annualSalary2 = employee2.getMonthlySalary() * 12;


		System.out.printf("Hi:%s,%s, your details is as follows: monthly pay:#%f,annual pay:#%f", employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary(), annualSalary1);
		System.out.println();
		System.out.printf("Hi:%s,%s, your details is as follows: monthly pay:#%f,annual pay:#%f", employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary(), annualSalary2); 
	}
}
