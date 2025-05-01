import java.util.Arrays;

public class Task13 {
    public static int[] removeLocalMaxima(int[] array) {
        boolean[] isLocalMax = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                isLocalMax[i] = array[i] > array[i + 1];
            } else if (i == array.length - 1) {
                isLocalMax[i] = array[i] > array[i - 1];
            } else {
                isLocalMax[i] = array[i] > array[i - 1] && array[i] > array[i + 1];
            }
        }

        int count = 0;
        for (boolean max : isLocalMax) {
            if (max) count++;
        }

        int[] result = new int[array.length - count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (!isLocalMax[i]) {
                result[index++] = array[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = {18, 1, 3, 6, 7, -5};
        int[] output = removeLocalMaxima(input);
        System.out.println(Arrays.toString(output));
    }
}