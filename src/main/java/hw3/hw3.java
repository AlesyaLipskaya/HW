package hw3;
import java.util.Scanner;
public class hw3 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int a = scan.nextInt();
        if (a % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечетное");
        }
    }
}