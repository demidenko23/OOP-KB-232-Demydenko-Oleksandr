public class Line {
    private double k; // коефіцієнт нахилу
    private double b; // вільний член

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        // Перевіряємо, чи не паралельні лінії (k1 != k2)
        if (this.k == other.k) {
            // Якщо k однакові, перевіряємо, чи не збігаються лінії (b1 == b2)
            if (this.b == other.b) {
                return null; // Лінії збігаються
            }
            return null; // Лінії паралельні
        }

        // Обчислюємо x координату точки перетину
        // З рівняння: k1*x + b1 = k2*x + b2
        // x = (b2 - b1) / (k1 - k2)
        double x = (other.b - this.b) / (this.k - other.k);

        // Обчислюємо y координату, підставляючи x в перше рівняння
        double y = this.k * x + this.b;

        return new Point(x, y);
    }
}