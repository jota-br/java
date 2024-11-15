public class Main {

    public static void main (String[] args) {

        Car car = new Car();

        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(false);
        car.setColor("black");

        car.describeCar();

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        System.out.println("color = " + car.getColor());
        System.out.println("doors = " + car.getDoors());
        System.out.println("is convertible = " + car.isConvertible());
    }
}