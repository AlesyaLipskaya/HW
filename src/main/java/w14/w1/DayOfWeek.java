package w14.w1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day = scanner.nextInt();
        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        try {
            String dateString = String.format("%04d-%02d-%02d", year, month, day);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = format.parse(dateString);
            SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
            String dayOfWeek = dayFormat.format(date);
            System.out.println("День недели: " + dayOfWeek);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
