package hw10;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввести 3 строки с консоли
        System.out.println("Введите три строки:");
        String[] strings = new String[3];
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
        }

        // Найти самую короткую и самую длинную строки
        String shortestString = strings[0];
        String longestString = strings[0];
        for (int i = 1; i < 3; i++) {
            if (strings[i].length() < shortestString.length()) {
                shortestString = strings[i];
            }
            if (strings[i].length() > longestString.length()) {
                longestString = strings[i];
            }
        }

        // Вывести найденные строки и их длину
        System.out.println("Самая короткая строка: " + shortestString + ", длина: " + shortestString.length());
        System.out.println("Самая длинная строка: " + longestString + ", длина: " + longestString.length());

        // Снова ввести 3 строки с консоли
        System.out.println("Введите еще три строки:");
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
        }

        // Упорядочить и вывести строки в порядке возрастания значений их длины
        Arrays.sort(strings, (a, b) -> a.length() - b.length());
        System.out.println("Строки в порядке возрастания длины:");
        for (String string : strings) {
            System.out.println(string);
        }

        // Снова ввести 3 строки с консоли
        System.out.println("Введите еще три строки:");
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
        }

        // Найти среднюю длину строк
        int totalLength = 0;
        for (String string : strings) {
            totalLength += string.length();
        }
        double averageLength = totalLength / 3.0;

        // Вывести на консоль строки, длина которых меньше средней, а также их длину
        System.out.println("Строки, длина которых меньше средней (" + averageLength + "):");
        for (String string : strings) {
            if (string.length() < averageLength) {
                System.out.println(string + ", длина: " + string.length());
            }
        }

        // Снова ввести 3 строки с консоли
        System.out.println("Введите еще три строки:");
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
        }

        // Найти слово, состоящее только из различных символов
        String uniqueWord = null;
        for (String string : strings) {
            boolean isUnique = true;
            for (int i = 0; i < string.length(); i++) {
                char currentChar = string.charAt(i);
                if (string.indexOf(currentChar) != string.lastIndexOf(currentChar)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueWord = string;
                break;
            }
        }

        // Вывести на консоль новую строку, которой задублирована каждая буква из начальной строки
        StringBuilder duplicatedString = new StringBuilder();
        for (int i = 0; i < uniqueWord.length(); i++) {
            char currentChar = uniqueWord.charAt(i);
            duplicatedString.append(currentChar).append(currentChar);
        }
        System.out.println("Новая строка с задублированными буквами: " + duplicatedString.toString());
    }
}
