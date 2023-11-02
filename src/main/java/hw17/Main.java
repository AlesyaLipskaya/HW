package hw17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+"); // Разделение строки на слова

        for (String word : words) {
            if (word.matches("[A-Z]{2,6}")) { // Проверка на соответствие аббревиатуре
                System.out.println(word);
            }
        }
    }
}
