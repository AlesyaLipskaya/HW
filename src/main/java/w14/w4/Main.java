package w14.w4;

public class Main {
    public static void main(String[] args) {
        int a = 13;
        int b = 69;

        // Лямбда-выражение для проверки условия и возвращения результата
        ResultProvider resultProvider = (x, y) -> {
            if (x < y) {
                return x;
            } else if (x > y) {
                return y;
            } else {
                return 0;
            }
        };

        // Вызов лямбда-выражения
        int result = resultProvider.getResult(a, b);
        System.out.println("Результат: " + result);
    }

    // Функциональный интерфейс с методом getResult()
    interface ResultProvider {
        int getResult(int x, int y);
    }
}
