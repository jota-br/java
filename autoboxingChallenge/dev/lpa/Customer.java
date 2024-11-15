package autoboxingChallenge.dev.lpa;

import java.util.ArrayList;

public class Customer {
    
    private String name;
    private ArrayList<Double> transactions;
    
    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addTransaction'");
    }

    
}
