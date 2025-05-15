public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        if (!isValidTriangle(a, b, c)) {
            throw new IllegalArgumentException("Invalid triangle: points are collinear or identical.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean isValidTriangle(Point a, Point b, Point c) {
        // Перевірка чи не збігаються координати
        if (a.equals(b) || b.equals(c) || a.equals(c)) {
            return false;
        }

        // Перевірка чи точки не лежать на одній прямій (площа == 0)
        double area = 0.5 * Math.abs(
            a.getX() * (b.getY() - c.getY()) +
            b.getX() * (c.getY() - a.getY()) +
            c.getX() * (a.getY() - b.getY())
        );
        return area > 0;
    }

    public double area() {
        return 0.5 * Math.abs(
            a.getX() * (b.getY() - c.getY()) +
            b.getX() * (c.getY() - a.getY()) +
            c.getX() * (a.getY() - b.getY())
        );
    }

    public Point centroid() {
        double x = (a.getX() + b.getX() + c.getX()) / 3.0;
        double y = (a.getY() + b.getY() + c.getY()) / 3.0;
        return new Point(x, y);
    }
}
