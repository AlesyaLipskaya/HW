package hw14.w4;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму: ");
        String input = scanner.nextLine();

        Consumer<String> convertToDollars = str -> {
            String[] parts = str.split(" ");
            double amount = Double.parseDouble(parts[0]);
            double convertedAmount = amount / 3.29;
            System.out.println("Сумма в долларах: " + convertedAmount);
        };

        convertToDollars.accept(input);
    }
}