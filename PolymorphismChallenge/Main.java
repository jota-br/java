public class Main {

    public static void main(String[] args) {
        
        Car car = new GasPoweredCar("Ford Cobalt", 11, 4);
        runCar(car);

        car = new HybridCar("Toyota Coralla", 25, 500, 6);
        runCar(car);

        car = new ElectricCar("Prius", 50, 300);
        runCar(car);
    }

    public static void runCar(Car car) {

        car.startEngine();
        car.drive();
    }
}