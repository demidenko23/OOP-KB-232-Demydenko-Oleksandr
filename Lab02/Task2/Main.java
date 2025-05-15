public class Main {
    public static void main(String[] args) {
        Segment s1 = new Segment(new Point(1, 1), new Point(3, 3));
        Segment s2 = new Segment(new Point(1, 3), new Point(3, 1));

        System.out.println("length: " + s1.length());
        System.out.println("middle: " + s1.middle());
        System.out.println("intersection: " + s1.intersection(s2));
    }
}
