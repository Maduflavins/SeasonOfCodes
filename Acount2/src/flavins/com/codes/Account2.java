package flavins.com.codes;

public class Account2 {
    private String accountName;
    private int accountNumber;
    private int accountBalance;

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void getLoan(int loanAmount){
        if(this.accountBalance < loanAmount){
            System.out.println("you are not qualified");
        }else{
            System.out.println("we are processing your loan");
            System.out.println("loan: " + loanAmount + " balance " + accountBalance);
        }
    }
}
