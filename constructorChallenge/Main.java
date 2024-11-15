public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer("Elthon", 10.00d, "elthon@email.com");
        Customer customer3 = new Customer("Hilton", "hilton@email.com");

        System.out.println(customer1.getName() + " " + customer1.getEmail() + " " + customer1.getCreditLimit());
        System.out.println(customer2.getName() + " " + customer2.getEmail() + " " + customer2.getCreditLimit());
        System.out.println(customer3.getName() + " " + customer3.getEmail() + " " + customer3.getCreditLimit());
    }
}