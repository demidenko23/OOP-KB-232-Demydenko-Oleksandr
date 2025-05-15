public class Main {
    public static void main(String[] args) {
        Figure t = new Triangle(new Point(0, 0), new Point(4, 0), new Point(2, 3));
        Figure q = new Quadrilateral(new Point(0, 0), new Point(4, 0), new Point(4, 3), new Point(0, 3));
        Figure c = new Circle(new Point(1, 1), 2.5);

        System.out.println(t + " | Area: " + t.area() + " | Centroid: " + t.centroid());
        System.out.println(q + " | Area: " + q.area() + " | Centroid: " + q.centroid());
        System.out.println(c + " | Area: " + c.area() + " | Centroid: " + c.centroid());
    }
}
