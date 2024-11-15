import java.util.Arrays;

public abstract class Point implements Mappable {

    private double[] location = new double[2];

    public Point(String location) {
        this.location = Mappable.stringToLatLon(location);
    }

    public String location() {
        return Arrays.toString(this.location);
    }

    public void render() {

        System.out.println("Render " + this + " as " + this.getShape() + " (" + location() + ")");
    }
}
