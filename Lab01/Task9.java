import java.util.Scanner;

public class Task9 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ax^2+bx+c=0");
        System.out.println("Введіть коефіцієнти a, b, c :");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Це не квадратне рівняння");
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println(Math.min(x1, x2) + " " + Math.max(x1, x2));
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println(x);
        } else {
            System.out.println("Коренів нема");
        }
    }
}