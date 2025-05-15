public class Segment {
    private final Point a, b;

    public Segment(Point a, Point b) {
        if (a.equals(b)) throw new IllegalArgumentException("Вироджений відрізок");
        this.a = a;
        this.b = b;
    }

    public double length() {
        return Math.hypot(b.x - a.x, b.y - a.y);
    }

    public Point middle() {
        return new Point((a.x + b.x) / 2, (a.y + b.y) / 2);
    }

    public Point intersection(Segment s) {
        double x1 = a.x, y1 = a.y, x2 = b.x, y2 = b.y;
        double x3 = s.a.x, y3 = s.a.y, x4 = s.b.x, y4 = s.b.y;
        double d = (x1 - x2)*(y3 - y4) - (y1 - y2)*(x3 - x4);
        if (Math.abs(d) < 1e-9) return null;

        double px = ((x1*y2 - y1*x2)*(x3 - x4) - (x1 - x2)*(x3*y4 - y3*x4)) / d;
        double py = ((x1*y2 - y1*x2)*(y3 - y4) - (y1 - y2)*(x3*y4 - y3*x4)) / d;
        Point p = new Point(px, py);

        if (onSegment(p, a, b) && onSegment(p, s.a, s.b)) return p;
        return null;
    }

    private boolean onSegment(Point p, Point a, Point b) {
        return p.x >= Math.min(a.x, b.x) - 1e-9 && p.x <= Math.max(a.x, b.x) + 1e-9 &&
               p.y >= Math.min(a.y, b.y) - 1e-9 && p.y <= Math.max(a.y, b.y) + 1e-9;
    }
}
