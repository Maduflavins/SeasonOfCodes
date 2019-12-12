//Accounts.java
//Displaying the name Instance Variable (Attribute) and set and get methods the values of the name (of the Accounts class' object).

public class Accounts{
	private String name; //instance variable

	//Method to set the name in the object
	public void setName(String name){
		this.name = name; 
	}
	
	//Method to get the name in the object
	public String getName(){
		return name; // returns the name to the caller
	}
} //end class Accounts