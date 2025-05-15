import java.util.Arrays;

public class Task14 {

    // Зсув на 1 позицію вправо
    public static void cycleSwap(int[] array) {
        if (array.length <= 1) return;

        int last = array[array.length - 1];
        System.arraycopy(array, 0, array, 1, array.length - 1);
        array[0] = last;
    }

    // Зсув на shift позицій вправо
    public static void cycleSwap(int[] array, int shift) {
        if (shift <= 0 || array.length <= 1) return;

        shift = shift % array.length; // Нормалізуємо зсув
        int[] temp = Arrays.copyOfRange(array, array.length - shift, array.length);
        System.arraycopy(array, 0, array, shift, array.length - shift);
        System.arraycopy(temp, 0, array, 0, shift);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 7, 4};
        cycleSwap(arr1);
        System.out.println("Зсув на 1: " + Arrays.toString(arr1)); // [4, 1, 3, 2, 7]

        int[] arr2 = {1, 3, 2, 7, 4};
        cycleSwap(arr2, 3);
        System.out.println("Зсув на 3: " + Arrays.toString(arr2)); // [2, 7, 4, 1, 3]
    }
}
