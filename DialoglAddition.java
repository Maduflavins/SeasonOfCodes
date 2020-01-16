//Dialog.java
import javax.swing.JOptionPane;

public class DialoglAddition{
	public static void main(String[] args){

		//Prompt the user to enter name
		String name = JOptionPane.showInputDialog("Enter first number: ");
	
		//Creating the message
		String number1 = String.format("The first number is %s", name);

		//display a dialog box with a message
		JOptionPane.showMessageDialog(null, number1);

		//Prompt the user to enter name
		String name1 = JOptionPane.showInputDialog("Enter second number: ");
	
		//Creating the message
		String number2 = String.format("The first number is %s", name1);

		//display a dialog box with a message
		JOptionPane.showMessageDialog(null, number2);

		//Convert the strings to integer
		int x = Integer.parseInt(name);
		int y = Integer.parseInt(name1);

		int z = x + y;
		String w = String.format("The sum of both numbers is: %d ", z);
		JOptionPane.showMessageDialog(null, w);
	}
}