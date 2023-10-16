package w14.dop;
import java.util.Scanner;
import java.util.function.Predicate;

public class StringCheck {
    public static boolean checkString(String str) {
        Predicate<String> predicate = s -> s.startsWith("J") || s.startsWith("N") && s.endsWith("A");
        return predicate.test(str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        boolean result = checkString(str);
        System.out.println(result);
    }
}
