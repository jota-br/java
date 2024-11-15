package autoboxingChallenge3.dev.lpa;
import java.util.ArrayList;

public class Branch {
    
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<Customer>(1000);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialTransaction) {

        Customer customer = findCustomer(name);
        if (customer == null) {
            customer = new Customer(name, initialTransaction);
            customers.add(customer);
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String name, double transaction) {

        Customer customer = findCustomer(name);
        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String name) {

        for (Customer c : customers) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }

        return null;
    }
    
}
