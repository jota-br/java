public class Account {
    private String name;
    private String email;
    private String phone;
    private int account;
    private double balance;

    // no-args Constructor
    public Account(){
        this("Unknown name", "no@email.com", "00 00 0000-0000", 0, 0.00d);
        System.out.println("Empty constructor called");
    }

    public Account (String name, String email, String phone, int account, double balance) {
        System.out.println("Constructor with parameters called");
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.account = account;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        if (name == null) {
            this.name = "Invalid name";
        } else {
            this.name = name;
        }
    }

    public void setEmail(String email) {
        if (email == null) {
            this.email = "Invalid email";
        } else {
            this.email = email;
        }
    }

    public void setPhone(String phone) {
        if (phone == null) {
            this.phone = "Invalid phone";
        } else {
            this.phone = phone;
        }
    }

    public void setAccount(int account) {
        if (account < 0) {
            this.account = -1;
        } else {
            this.account = account;
        }
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void depositFunds(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit of " + amount + "$ funds, your new balance is " + this.balance +"$");
        } else {
            System.out.println("Desposit must be greater than 0.00$");
        }
    }

    public void withdrawFunds(double amount) {
        if (amount <= this.balance && amount > 0) {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + "$, new balance is " + this.balance + "$");
        } else {
            System.out.println("Insufficient funds, you account balance is " + this.balance + "$");
        }
    }

    public void accountDetails() {
        System.out.println("Account: " + this.account +
            " Name: " + this.name +
            " E-mail: " + this.email +
            " Phone: " + this.phone +
            " Balance: " + this.balance + "$");
    }
}