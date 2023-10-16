package hw14.w5;

import java.util.Scanner;
import java.util.function.Supplier;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        Supplier<String> reverseString = () -> {
            StringBuilder reversed = new StringBuilder(input);
            return reversed.reverse().toString();
        };

        String reversedString = reverseString.get();
        System.out.println("Строка задом наперед: " + reversedString);
    }
}