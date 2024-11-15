package autoboxingChallenge.dev.lpa;

public class Main {
    
    public static void main(String[] args) {
        
        Bank bank = new Bank("Caixa");

        bank.addCustomer("John", bank.getCustomers());
        System.out.println(bank.addCustomer("John", bank.getCustomers()));
        bank.addTransaction(bank.getCustomers().get(0), 40.0, bank.getCustomers());
        bank.printTransactions(bank.getCustomers().get(0));
    }
}
