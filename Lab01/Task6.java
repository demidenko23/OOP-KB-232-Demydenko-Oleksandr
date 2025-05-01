import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть загальну суму рахунку: ");
        double billAmount = scanner.nextDouble();

        System.out.print("Введіть кількість друзів: ");
        int friendsCount = scanner.nextInt();

        if (billAmount < 0) {
            System.out.println("Сума рахунку не може бути від'ємною!");
            return;
        }

        if (friendsCount <= 0) {
            System.out.println("Кількість друзів має бути більше нуля!");
            return;
        }

        double totalWithTips = billAmount * 1.10;

        double amountPerFriend = totalWithTips / friendsCount;

        System.out.println((int)amountPerFriend);
    }
}