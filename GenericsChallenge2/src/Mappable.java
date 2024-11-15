public interface Mappable {

    void render();

    Type getType();
    Shape getShape();

    static double[] stringToLatLon(String location) {

        String[] latLon = location.split(",");
        double lat = Double.parseDouble(latLon[0]);
        double lon = Double.parseDouble(latLon[1]);
        return new double[]{lat, lon};
    }
}