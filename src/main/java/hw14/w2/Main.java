package hw14.w2;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, -2, 3, -4, 5};

        printPositiveNumbers(numbers);
    }

    private static void printPositiveNumbers(Integer[] numbers) {
        Predicate<Integer> isPositive = n -> n > 0;

        for (Integer number : numbers) {
            if (isPositive.test(number)) {
                System.out.println(number);
            }
        }
    }
}
