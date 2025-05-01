import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hello, please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name);
        scan.close();
    }
}