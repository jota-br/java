public class Main {
    public static void main (String[] args) {
        Account account = new Account();
        account.accountDetails();

        account.setAccount(1);
        account.setEmail("a@a.com");
        account.setName("Jota");
        account.setPhone("+55 55 111111-1111");
        account.setBalance(10000.00d);

        account.accountDetails();

        account.depositFunds(99.99d);
        account.withdrawFunds(9999.91d);

        account.accountDetails();

        Account otherAccount = new Account("John", "john@email.com", "55 11 1111-1111", 2, 100);

        otherAccount.accountDetails();

        otherAccount.depositFunds(99.99d);
        otherAccount.withdrawFunds(9.90d);

        otherAccount.accountDetails();
    }
}