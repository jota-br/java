public class River extends Line {

    private String name;
    private Shape shapeType = Shape.LINE;
    private Type usageType = Type.RIVER;

    public River(String name, String... locations) {
        super(locations);
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