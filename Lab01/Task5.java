import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter: a, b, h: ");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // підйом за день
        int b = scanner.nextInt(); // спуск за ніч
        int h = scanner.nextInt(); // висота дерева

        if (a <= b && a < h) {
            System.out.println("Impossible");
        } else {
            int days = 0;
            int currentHeight = 0;

            while (true) {
                days++;
                currentHeight += a;
                if (currentHeight >= h) {
                    System.out.println(days);
                    break;
                }
                currentHeight -= b;
            }
        }
    }
}