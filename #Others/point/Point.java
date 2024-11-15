public class Point {
    private int x;
    private int y;

    

    public Point() {
    }
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(Point A) {
        return (double) Math.sqrt((this.x - A.x) * (this.x - A.x) + (this.y - A.y) * (this.y - A.y));
    }

    public double distance(int A, int B) {
        return (double) Math.sqrt((this.x - A) * (this.x - A) + (this.y - A) * (this.y - A));
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    
}
