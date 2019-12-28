package flavins.com.codes;

import java.util.ArrayList;

public class Customers {
    private String name;
    private ArrayList<Double>transactions;

    public Customers(String name, double intitalTransactions) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransactions(intitalTransactions);
    }

    public void addTransactions(double ammount){
        this.transactions.add(ammount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
