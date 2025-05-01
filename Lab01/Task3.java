import java.util.Scanner;

public class Task3 {
    private static final int PASSWORD = 12345; // Секретний пароль

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть пароль: ");
        int userInput = scanner.nextInt();

        if (userInput == PASSWORD) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}