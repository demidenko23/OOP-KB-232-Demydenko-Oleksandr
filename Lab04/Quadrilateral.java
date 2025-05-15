public class Quadrilateral extends Figure {
    private final Point a, b, c, d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        if (isDegenerate(a, b, c, d)) {
            throw new IllegalArgumentException("Points form a degenerate quadrilateral.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    private boolean isDegenerate(Point p1, Point p2, Point p3, Point p4) {
        Triangle t1 = new Triangle(p1, p2, p3);
        Triangle t2 = new Triangle(p1, p3, p4);
        return t1.area() + t2.area() == 0.0;
    }

    @Override
    public double area() {
        // Divide quad into two triangles
        Triangle t1 = new Triangle(a, b, c);
        Triangle t2 = new Triangle(a, c, d);
        return t1.area() + t2.area();
    }

    @Override
    public Point centroid() {
        // Average of all four points
        return new Point((a.x + b.x + c.x + d.x) / 4, (a.y + b.y + c.y + d.y) / 4);
    }

    @Override
    public String toString() {
        return "Quadrilateral[" + a + " " + b + " " + c + " " + d + "]";
    }
}
