public class Task10 {

    public static int max(int[] numbers) {
        int maxValue = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] Array = {2, 3, 1, 7, 4, 1};
        System.out.println("Максимальне значення: " + max(Array));
    }
}
