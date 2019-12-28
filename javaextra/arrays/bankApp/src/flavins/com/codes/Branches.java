package flavins.com.codes;

import java.util.ArrayList;

public class Branches {
    private String name;
    private ArrayList<Customers>customer;

    public Branches(String name) {
        this.name = name;
        this.customer = new ArrayList<Customers>();
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initialTransaction){
        if(findCustomer(customerName) == null){
            this.customer.add(new Customers(customerName, initialTransaction));
            return true;
        }
        return false;
    }

    public ArrayList<Customers> getCustomer() {
        return customer;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customers existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransactions(amount);
            return true;
        }
        return false;
    }

    private Customers findCustomer(String customerName){
        for(int i=0; i < customer.size(); i++){
            Customers checkedCustomer = this.customer.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }


}
