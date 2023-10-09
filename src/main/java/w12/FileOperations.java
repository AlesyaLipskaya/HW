package w12;
import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
        // Запись строки в файл
        try {
            // Создаем объект для записи в файл
            FileOutputStream fileOutputStream = new FileOutputStream("tms.txt");

            // Получаем строку от пользователя
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите строку:");
            String inputString = reader.readLine();

            // Преобразуем строку в массив байтов и записываем в файл
            byte[] bytes = inputString.getBytes();
            fileOutputStream.write(bytes);

            // Закрываем потоки
            fileOutputStream.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Чтение строки из файла
        try {
            // Создаем объект для чтения из файла
            FileInputStream fileInputStream = new FileInputStream("tms.txt");

            // Читаем данные из файла в массив байтов
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);

            // Преобразуем массив байтов в строку
            String outputString = new String(bytes);

            // Заменяем пробелы на знак нижнего подчеркивания
            outputString = outputString.replace(" ", "_");

            // Выводим результат в консоль
            System.out.println(outputString);

            // Закрываем поток
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}