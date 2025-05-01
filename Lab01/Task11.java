public class Task11 {
    public static int sum(int[] n) {
        int s = 0;
        if (n != null) for (int x : n) if (x % 2 == 0) s += x;
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{3,5,1,4,1,12,41}));
    }
}