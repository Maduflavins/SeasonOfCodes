package flavins.com.codes;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Account2 Obj = new Account2();
        Scanner inpput = new Scanner(System.in);
        System.out.println("Please enter your name ");
        String accountName = inpput.nextLine();
        Obj.setAccountName(accountName);
        System.out.println("Enter balance: ");
        int accountBalance = inpput.nextInt();
        Obj.setAccountBalance(accountBalance);
        System.out.println("Enter loan amount: ");
        int loanAmount = inpput.nextInt();
        Obj.getLoan(loanAmount);


    }
}
