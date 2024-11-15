package autoboxingChallenge.dev.lpa;

import java.util.ArrayList;

public class Bank {
    
    private String bankName;
    private ArrayList<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<Customer>();
    }

    public boolean addCustomer(String customerName, ArrayList<Customer> customers) {

        for (Customer customer: customers) {
            if (customer.getName().equals(customerName)) {
                return false;
            }
        }
        customers.add(new Customer(customerName));
        return true;
    }

    public boolean addTransaction(Customer customer, Double transaction, ArrayList<Customer> customers) {

        var hasCustomer = findCustomer(customer, customers);

        if (hasCustomer == null) {
            return false;
        }

        hasCustomer.getTransactions().add(transaction);
        return true;
    }

    public static Customer findCustomer(Customer customer, ArrayList<Customer> customers) {

        for (Customer c : customers) {
            if (c.getName().equals(c.getName())) {
                return c;
            }
        }
        return null;
    }

    public static Customer findCustomer(String customerName, ArrayList<Customer> customers) {

        for (Customer c : customers) {
            if (c.getName().equals(customerName)) {
                return c;
            }
        }
        return null;
    }

    public void printTransactions(Customer customer) {

        System.out.print("Customer: " + customer.getName() + ", transactions: ");
        for (double transaction : customer.getTransactions()) {
            System.out.print(transaction);
        }
        System.out.println();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    
}
