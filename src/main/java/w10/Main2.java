package w10;

public class Main2 {

        public static void main(String[] args) {
            // Создание объекта StringBuilder с начальной строкой
            StringBuilder sb = new StringBuilder("Hello");

            // Добавление строки "xxxx"
            sb.append("xxxx");

            // Вставка символа "y" в 5-ю позицию
            sb.insert(4, "y");

            // Удаление символов с 3 по 6
            sb.delete(2, 7);

            // Переворот строки
            sb.reverse();

            // Преобразование StringBuilder в String и вывод в консоль
            String result = sb.toString();
            System.out.println(result);
        }
    }