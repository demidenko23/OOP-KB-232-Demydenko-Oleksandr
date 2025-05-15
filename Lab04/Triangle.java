public class Triangle extends Figure {
    private final Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        if (areCollinear(a, b, c)) {
            throw new IllegalArgumentException("Points are collinear — not a valid triangle.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean areCollinear(Point p1, Point p2, Point p3) {
        // Area by determinant = 0 for collinear
        return 0.5 * Math.abs(p1.x*(p2.y - p3.y) + p2.x*(p3.y - p1.y) + p3.x*(p1.y - p2.y)) == 0.0;
    }

    @Override
    public double area() {
        return 0.5 * Math.abs(a.x*(b.y - c.y) + b.x*(c.y - a.y) + c.x*(a.y - b.y));
    }

    @Override
    public Point centroid() {
        return new Point((a.x + b.x + c.x) / 3, (a.y + b.y + c.y) / 3);
    }

    @Override
    public String toString() {
        return "Triangle[" + a + " " + b + " " + c + "]";
    }
}
