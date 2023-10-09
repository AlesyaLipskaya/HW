package w12;
import java.io.*;

public class FileOperations2 {
    public static void main(String[] args) {
        // Запись строки в файл
        try {
            // Создаем объект для записи в файл
            FileWriter fileWriter = new FileWriter("tms2.txt");

            // Записываем фразу на латыни в файл
            fileWriter.write("Cognosce te ipsum");

            // Закрываем поток
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Чтение строки из файла и вывод первой буквы в консоль
        try {
            // Создаем объект для чтения из файла
            FileReader fileReader = new FileReader("tms2.txt");

            // Читаем первый символ из файла
            int firstChar = fileReader.read();

            // Выводим первую букву в консоль
            System.out.println((char) firstChar);

            // Закрываем поток
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
