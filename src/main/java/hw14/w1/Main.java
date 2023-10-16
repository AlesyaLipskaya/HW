package hw14.w1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создание объекта Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрос ввода даты рождения пользователя
        System.out.print("Введите дату своего рождения (в формате ДД.ММ.ГГГГ): ");
        String birthday = scanner.nextLine();

        // Преобразование введенной строки в объект LocalDate с помощью DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthdate = LocalDate.parse(birthday, formatter);

        // Добавление 100 лет к дате рождения
        LocalDate hundredthBirthday = birthdate.plusYears(100);

        // Вывод результата
        System.out.println("Вам исполнится 100 лет " + hundredthBirthday);
    }
}
