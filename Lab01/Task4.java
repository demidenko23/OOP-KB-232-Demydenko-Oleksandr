import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість незнайомців: ");
        int numberOfStrangers = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера після nextInt()

        if (numberOfStrangers < 0) {
            System.out.println("Кількість незнайомців не може бути від'ємною!");
        } else if (numberOfStrangers == 0) {
            System.out.println("Немає кого вітати.");
        } else {
            System.out.println("Введіть імена незнайомців:");
            for (int i = 0; i < numberOfStrangers; i++) {
                String name = scanner.nextLine();
                System.out.println("Hello, " + name);
            }
        }
    }
}