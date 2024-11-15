public class Park extends Point {

    private String name;
    private Shape shapeType = Shape.POINT;
    private Type usageType = Type.NATIONAL_PARK;

    public Park(String name, String location) {
        super(location);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + getType();
    }

    @Override
    public Type getType() {
        return this.usageType;
    }

    @Override
    public Shape getShape() {
        return this.shapeType;
    }
}