public class Account{
	private String name;
	private double balance;
	
	public Account(String name, double balance){
		this.name = name;
		if(balance > 0.0){
			this.balance = balance;
		}
	}
	public void deposit(double depositAmount){
		if(depositAmount > 0.0){
			balance += depositAmount;
		}
	}
	public double getBalance(){
		return balance;
	}

	public void setName(String name, double balance){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public void withdraw(double withdrawAmount){
		if(withdrawAmount > balance){
			System.out.println("Withdrawal amount exceeded account balance");
		}else{
			double remainingBalance= balance - withdrawAmount;
			System.out.println("thank you for banking with us \nyour remaining blance is: " + remainingBalance);
		}
	}
	
}


