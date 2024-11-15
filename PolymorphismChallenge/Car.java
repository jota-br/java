public class Car {
    
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.format("Car -> startEngine %n");
    }

    public void drive() {
        this.runEngine();
        System.out.format("Car -> driving, type is %s ", this.getClass().getSimpleName());
    }

    protected void runEngine() {
        System.out.format("Car -> runEngine %n");
    }
}
