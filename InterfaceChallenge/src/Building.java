public class Building implements Mappable {

    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public String getMarker() {
        return switch (usage) {
            case ENTERTAINMENT -> Color.GREEN + " " + PointMaker.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + PointMaker.STAR;
            case RESIDENTIAL -> Color.BLUE + " " + PointMaker.SQUARE;
            case SPORTS -> Color.ORANGE + " " + PointMaker.PUSH_PIN;
            default -> Color.BLACK + " " + PointMaker.CIRCLE;
        };
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name:" "%s", "usage:" "%s" """.formatted(name, usage);
    }
}
