package w14.dop;
import java.util.Scanner;
import java.util.function.Function;

public class LambdaExpression {
    public static String checkNumber(int number) {
        Function<Integer, String> function = n -> {
            if (n > 0) {
                return "Положительное число";
            } else if (n < 0) {
                return "Отрицательное число";
            } else {
                return "Ноль";
            }
        };
        return function.apply(number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        String result = checkNumber(number);
        System.out.println(result);
    }
}
