package flavins.com.codes;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branches> branch;

    public Bank(String name) {
        this.name = name;
        this.branch = new ArrayList<Branches>();
    }

    public boolean addBranch(String branchName){
        if(findBankBranch(branchName) == null){
            this.branch.add(new Branches(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Branches checkedBranch = findBankBranch(branchName);
        if(checkedBranch != null){
            return checkedBranch.newCustomer(customerName, initialTransaction);
        }
        return  false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branches branch = findBankBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branches findBankBranch(String bankName){
        for(int i = 0; i < branch.size(); i++){
            Branches bankBranch = this.branch.get(i);
            if(bankBranch.getName().equals(bankName)){
                return bankBranch;
            }
        }
        return null;
    }


   public boolean listCustomers(String branchName, boolean showTransaction){
        Branches branch = findBankBranch(branchName);
        if(branch != null){
           ArrayList<Customers> customerList = branch.getCustomer();
           for(int i = 0; i<customerList.size(); i++){
               Customers branchCustomers = customerList.get(i);
               System.out.println("Customer: " + branchCustomers.getName() + " [ " + (i + 1) + " ]");
               if(showTransaction){
                   System.out.println("Bank Transactions for this Branch");
                   ArrayList<Double>branchTransactions = branchCustomers.getTransactions();
                   for(int j = 0; j<branchTransactions.size(); j++){
                       System.out.println("[ " + (j + 1) + " ] " + " Amount " + branchTransactions.get(j));
                   }
               }
           }
           return true;
        }else{
            return false;
        }

   }
}
