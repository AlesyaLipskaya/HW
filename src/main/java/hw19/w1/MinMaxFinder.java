package hw19.w1;
import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        Thread minMaxThread = new Thread(() -> {
            int min = array[0];
            int max = array[0];
            for (int value : array) {
                if (value < min) {
                    min = value;
                }
                if (value > max) {
                    max = value;
                }
            }
            System.out.println("Минимум: " + min);
            System.out.println("Максимум: " + max);
        });

        minMaxThread.start();
    }
}
