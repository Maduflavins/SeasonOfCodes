//Fig. 3.5: Account.java
//Account class with a constructor that initializes the name.

public class Account{
	private String name;
	private double balance;

	//constructor initializes name with parameter name
	public Account(String name, double balance){ // constructor name is class name
		this.name = name;
		if (balance > 0.0){
			this.balance = balance;
		}
	}

	//Method for making deposits and altering the balance
	public void deposit(double depositAmount){
		if (depositAmount > 0.0){
			balance = balance + depositAmount;
		}
	}

	//Method for making withdrawals and altering the balance
	public void withdraw(double drawAmount){
		if (drawAmount > balance){
			this.balance = balance;
			System.out.println("\nWithdraw failed. Withdraw amount exceeded account balance!");
		}
		if (drawAmount <= balance){
			balance = balance - drawAmount;
		}
	}

	//Method to get to return the balance
	public double getBalance(){
		return balance;
	}

	//method to set the name
	public void setName(String name){
		this.name = name;
	}

	// method to retrieve the name
	public String getName(){
 		return name;
 	}

	public String displayAccount(){
	    return "Name "+this.name+" "+"Balance "+this.balance;
	}

} // end class Account