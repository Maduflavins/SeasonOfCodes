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
} // end class Account