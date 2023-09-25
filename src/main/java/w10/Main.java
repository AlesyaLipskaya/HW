package w10;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Способ 1 оператор "+"
        String result1 = str1 + str2;

        // Способ 2 concat()
        String result2 = str1.concat(str2);
        System.out.println("1.1 " + result1 + " " + result2);

        // Проверка равенства с учетом регистра
        boolean isEqualCaseSensitive = str1.equals(str2);
        System.out.println("1.2 " + isEqualCaseSensitive);

        // Проверка равенства без учета регистра
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("1.2 " + isEqualIgnoreCase);

        String str = "Hello World";
        // Получение подстроки с 3-го символа до конца
        String substring = str.substring(2);
        System.out.println("1.3 " + substring);

        // Вывод длины строки
        int length = str.length();
        System.out.println("1.4 " + length);

        // Вывод порядкового номера символа
        int index = str.indexOf('o');
        System.out.println("1.5 " + index);

        boolean value = true;
        // Преобразование логического типа true к строке
        str = String.valueOf(value);
        System.out.println("1.6 " + str);

        // Перевод строки в верхний регистр
        String uppercase = str.toUpperCase();
        System.out.println("1.7 " + uppercase);

        // Замена символа '1' на '%'
        String replaced = str.replace('1', '%');
        System.out.println("1.8 " + replaced);

        // Удаление пробелов с начала и конца строки
        String trimmed = str.trim();
        System.out.println("1.9 " + trimmed);

        // Проверка, является ли строка пустой
        boolean isEmpty = str.isEmpty();
        System.out.println("1.10 " + isEmpty);

        // Разделение строки на несколько подстрок по символу ','
        String[] parts = str.split(",");
        for (String part : parts) {
            System.out.println("1.11 " + part);
        }
    }
}