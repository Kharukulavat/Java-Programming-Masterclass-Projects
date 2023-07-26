public class Point {
    private int x;
    private int y;
    public Point() {
        this(0,0);
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double distance() {
        return distance(0,0);
    }
    public double distance(int x, int y) {
//        int xDiff = this.x - x;
//        int yDiff = this.y - y;
//        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
        return Math.sqrt((getX() - x)*(getX() - x) + (getY() - y)*(getY() - y));
    }
    public double distance(Point p) {
        return distance(p.getX(), p.getY());
//        return Math.sqrt((getX() - p.getX())*(getX() - p.getX()) + (getY() - p.getY())*(getY() - p.getY()));
    }

}