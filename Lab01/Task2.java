import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        // Обробка випадку, коли години >= 24 (хоча за умовою вхідні дані в [0:00:00; 23:59:59])
        hours = hours % 24;

        System.out.printf("%d:%02d:%02d%n", hours, minutes, seconds);
    }
}
