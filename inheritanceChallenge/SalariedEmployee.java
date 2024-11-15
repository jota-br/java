public class SalariedEmployee extends Employee {
    
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hiredDate, double annualSalary) {
        super(name, birthDate, hiredDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double paycheck = this.annualSalary / 26d;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;
        return adjustedPay;
    }

    public void retire() {
        terminate("10/10/2024");
        this.isRetired = true;
        System.out.println(super.getName() + " just retired");
    }
    
}
