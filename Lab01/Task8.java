import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int number;

        System.out.println("Введіть послідовність чисел (закінчіть 0):");

        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("Середнє значення: " + average);
    }
}