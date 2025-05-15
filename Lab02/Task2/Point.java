public class Point {
    public final double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) return false;
        Point p = (Point) o;
        return Math.abs(x - p.x) < 1e-9 && Math.abs(y - p.y) < 1e-9;
    }

    @Override
    public String toString() {
        return "(" + x + ";" + y + ")";
    }
}
