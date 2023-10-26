package hw15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);

        // Удаление дубликатов
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Удаление дубликатов: " + distinctNumbers);

        // Оставить только четные элементы
        List<Integer> evenNumbers = numbers.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Оставить только четные элементы: " + evenNumbers);

        // Сумма оставшихся элементов
        int sum = numbers.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сумма оставшихся элементов: " + sum);
    }
}