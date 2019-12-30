public class NewAccount {
	int balance;
	String name;

	public int getBalance() {
    		return balance;
	}
	public void setBalance(int balance) {
    		this.balance = balance;
	}
	public String getName() {
    		return name;
	}
	public void setName(String name) {
 		this.name = name;
	}

	@Override
	public String toString() {

		return "Name "+this.name+" "+"Balance "+this.balance;
	}

	//**UPDATED CODE**
	public String displayAccount(){
	    return "Name "+this.name+" "+"Balance "+this.balance;
	}
}