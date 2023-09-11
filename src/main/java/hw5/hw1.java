package hw5;
import java.util.Random;
import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int columns = scanner.nextInt();

        int[][] hw51 = new int[rows][columns];

        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                hw51[i][j] = random.nextInt(100); // Здесь 100 - максимальное случайное число
            }
        }
        System.out.print("Введите число : ");
        int number = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                hw51[i][j] += number;
            }
        }
        System.out.println("Результат :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(hw51[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += hw51[i][j];
            }
        }
        System.out.println("Сумма : " + sum);
    }

}