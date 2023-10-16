package hw14.w3;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму: ");
        String input = scanner.nextLine();

        Function<String, Double> convertToDollars = (String str) -> {
            double sum = Double.parseDouble(str.split(" ")[0]);
            return sum / 3.29; // Предполагаемый курс обмена BYN на USD равен 3,29
        };

        double dollars = convertToDollars.apply(input);
        System.out.println("Сумма в долларах: " + dollars);
    }
}