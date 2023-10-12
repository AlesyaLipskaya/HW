package w14.w2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month - 1, day);
            calendar.add(Calendar.DAY_OF_WEEK, 1); // Переход к следующему дню
            while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.TUESDAY) {
                calendar.add(Calendar.DAY_OF_WEEK, 1); // Переход к следующему дню
            }

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = calendar.getTime();
            String dateString = format.format(date);
            System.out.println("Дата следующего вторника: " + dateString);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
