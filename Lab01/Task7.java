import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int current;

        System.out.println("Введіть послідовність чисел (закінчіть 0):");

        do {
            current = scanner.nextInt();
            if (current != 0 && current > max) {
                max = current;
            }
        } while (current != 0);

        System.out.println("Максимальне значення: " + max);
    }
}
