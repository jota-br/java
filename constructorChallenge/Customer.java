public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
    
    public Customer () {
        this("Unknown",  "unkown@email.com");
    }

    public Customer (String name, String email) {
        this(name, 1000.00d, email);
    }

    public Customer (String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
}
