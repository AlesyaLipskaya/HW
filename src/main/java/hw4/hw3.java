package hw4;
import java.util.Arrays;

public class hw3 {
    public static void main(String[] args) {
        System.out.println("3 задание");
        int[] mas = new int[10];
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
            if (mas[i] > max) {
                max = mas[i];
                maxIndex = i;
            }
            if (mas[i] < min) {
                min = mas[i];
                minIndex = i;
            }
        }
        System.out.println("Мин: " + min + minIndex + "Макс: " + max + maxIndex);
    }
}