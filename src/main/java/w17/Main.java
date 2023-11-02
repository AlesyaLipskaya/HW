package w17;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";

        System.out.println("Цифры из строки:");
        printDigits(input);

        System.out.println("Замена букв на &:");
        replaceLettersWithAmpersand(input);

        System.out.println("Инста:");
        findInstagram(input);

        System.out.println("Строка равна null?");
        System.out.println(isNullString(input));

        System.out.println("Замена \\n на пустую строку:");
        removeNewLines(input);

        System.out.println("Поиск имени и фамилии:");
        findNameAndSurname(input);
    }

    public static void printDigits(String str) {
        String digits = str.replaceAll("\\D+", ""); // Замена всех нецифровых символов на пустую строку
        System.out.println(digits);
    }

    public static void replaceLettersWithAmpersand(String str) {
        String replaced = str.replaceAll("[a-zA-Z]", "&"); // Замена каждой буквы на знак &
        System.out.println(replaced);
    }

    public static void findInstagram(String str) {
        String instagram = str.replaceAll(".*inst: @([a-zA-Z0-9_]+).*", "$1"); // Получение значения после "inst: @"
        System.out.println(instagram);
    }

    public static boolean isNullString(String str) {
        return str.equals("null");
    }

    public static void removeNewLines(String str) {
        String replaced = str.replaceAll("\\\\n", ""); // Замена \n на пустую строку
        System.out.println(replaced);
    }

    public static void findNameAndSurname(String str) {
        String pattern = "Меня зовут ([А-ЯЁ][а-яё]+) ([А-ЯЁ][а-яё]+)";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(str);
        if (matcher.find()) {
            String name = matcher.group(1);
            String surname = matcher.group(2);
            System.out.println("Имя: " + name);
            System.out.println("Фамилия: " + surname);
        }
    }
}