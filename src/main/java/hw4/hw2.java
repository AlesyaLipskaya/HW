package hw4;


public class hw2 {
    public static void main (String[] args) {
        System.out.println("2 задача");
        int max = 0;
        int min = 0;
        int[] max_min = {0, 4, 2, 3, -7, 5, 6, 12, 8, 9};
        for (int i = 0; i < max_min.length; i++) {
            if (max_min[i] > max) {
                max = max_min[i];
            }
        }
        System.out.println("Максимальный: " + max);
        for (int i = 0; i < max_min.length; i++) {
            if (max_min[i] < min) {
                min = max_min[i];
            }
        }
        System.out.println("Минимальный: " + min);
    }
}