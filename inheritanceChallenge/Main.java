public class Main {
    
    public static void main(String[] args) {

        SalariedEmployee tim = new SalariedEmployee("Tim", "10/10/1975", "10/10/1999", 75000.00d);
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());
        tim.retire();

        System.out.println("_ _ _ _");

        SalariedEmployee jose = new SalariedEmployee("Jose", "10/10/1955", "10/10/1980", 75000.00d);
        System.out.println("Age = " + jose.getAge());
        jose.retire();
        System.out.println("Pay = " + jose.collectPay());
        System.out.println(jose);

        System.out.println("_ _ _ _");

        HourlyEmployee mary = new HourlyEmployee("Mary", "10/10/1966", "10/10/1989", 75.00d);
        System.out.println(mary);
        System.out.println("Age = " + mary.getAge());
        System.out.println("Pay = " + mary.collectPay());
        System.out.println("Double Rate Pay = " + mary.getDoublePay());

    }
}
