package autoboxingChallenge3.dev.lpa;

import java.util.ArrayList;

public class Bank {

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
    }
    
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>(100);
    }

    public boolean addBranch(String name) {

        if (findBranch(name) == null) {
            branches.add(new Branch(name));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {

        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        return branch.newCustomer(customerName, initialTransaction);
    }

    public boolean addCustomerTransaction(String branchName, String name, double transaction) {

        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }

        for (Customer c : branch.getCustomers()) {
            if (c.getName().equalsIgnoreCase(name)) 
            {
                c.addTransaction(transaction);
                return true;
            }
        }

        return false;
    }

    private Branch findBranch(String name) {

        for (Branch b : branches) {
            if (b.getName().equalsIgnoreCase(name)) {
                return b;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {

        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        System.out.println("Customer details for branch " + branch.getName());
            for (Customer customer : branch.getCustomers()) {
                if (printTransactions) {
                    System.out.printf("Customer: %s[%d]%n", customer.getName(), branch.getCustomers().indexOf(customer) + 1);
                    System.out.println("Transactions");
                    for (double t : customer.getTransactions()) {
                        System.out.printf("[%d] Amount %.2f%n", customer.getTransactions().indexOf(t) + 1, t);
                    }
                } else {
                    System.out.printf("Customer: %s[%d]%n", customer.getName(), branch.getCustomers().indexOf(customer) + 1);
                }
            }

        return true;
    }
}
