package hw13.w1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите набор чисел:");
        String input = scanner.nextLine();

        String[] numbers = input.split(", ");

        Set<String> uniqueNumbers = new HashSet<>();
        for (String number : numbers) {
            uniqueNumbers.add(number);
        }

        System.out.println("Результат:");
        for (String number : uniqueNumbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}