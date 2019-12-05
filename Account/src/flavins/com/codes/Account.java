package flavins.com.codes;



public class Account {
        private long accountNumber;
        private double balance;
        private String customerName;
        private String email;
        private long phoneNumber;

        public Account(int accountNumber, double balance, String customerName, String email, int phoneNumber){
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.customerName = customerName;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        public void setAccountNumber(long accountNumber){
            this.accountNumber = accountNumber;
        }
        public long getAccountNumber(){
            return accountNumber;
        }
        public void setBalance(double balance){
            this.balance = balance;
        }
        public  double getBalance(){
            return balance;
        }
        public void setCustomerName(String customerName){
            this.customerName = customerName;
        }
        public String getCustomerName(){
            return customerName;
        }
        public void setEmail(String email){
            this.email = email;
        }
        public String getEmail(){
            return email;
        }
        public  void setPhoneNumber(long phoneNumber){
            this.phoneNumber = phoneNumber;
        }
        public  long getPhoneNumber(){
            return phoneNumber;
        }
        public void depositCash(double depositAmount){
            this.balance = balance + depositAmount;
            System.out.println("Deposit of " + depositAmount + " made. your new balance = " + this.balance + " thank you for banking with us");

        }
        public void withdrawCash(double withdrawAmount){
            if(withdrawAmount > this.balance){
                System.out.println("Your account balance is low");
            }else{
                this.balance = this.balance - withdrawAmount;
                System.out.println("withdrawal of " + withdrawAmount + " processed. Remaining balance = " + balance);
            }
        }
    }

