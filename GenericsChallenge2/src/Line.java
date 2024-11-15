import java.util.Arrays;

public abstract class Line implements Mappable {

    private double[][] locations;

    public Line(String... locations) {

        this.locations = new double[locations.length][];

        int i = 0;
        for (String l : locations) {

            this.locations[i] = Mappable.stringToLatLon(l);
            i++;
        }
    }

    public String location() {
        return Arrays.deepToString(this.locations);
    }

    public void render() {

        System.out.println("Render " + this + " as POINT (" + location() + ")");
    }
}
