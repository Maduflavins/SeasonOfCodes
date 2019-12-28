package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("Access Bank Nigeria");
	    if(bank.addBranch("Sabo Yaba")){
			System.out.println("Sabo Branch created");
		}
	    bank.addCustomer("Sabo Yaba", "Chinedu", 100.60);
	    bank.addCustomer("Sabo Yaba", "Mike sani", 19000.89);
	    bank.addCustomer("Sabo Yaba", "Sheu", 100.50);

	    bank.addBranch("Garki");
	    bank.addCustomer("GArki", "Martins", 700.20);

	    bank.addCustomerTransaction("Sabo Yaba", "Sheu", 100.10);
	    bank.addCustomerTransaction("Sabo Yaba", "Mike Sani", 200.10);
	    bank.addCustomerTransaction("Sabo Yaba", "Chinedu", 2000.10);

	    bank.listCustomers("Sabo Yaba", true);

	    if(!bank.addBranch("Sabo Yaba")){
			System.out.println("Sabo Yaba branch already exist");
		}

	    if(!bank.addCustomerTransaction("Sabo Yaba", "Ugo", 32000.89)){
			System.out.println("Customer does not exist at branch");
		}

	    if(!bank.addCustomer("Sabo Yaba", "Chinedu", 344.00)){
			System.out.println("Customer Chinedu is already registered in this branch");
		}
    }
}
