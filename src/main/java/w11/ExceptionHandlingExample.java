package w11;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        ExceptionHandlingExample example = new ExceptionHandlingExample();

        example.methodWithTryCatch();
        example.methodWithMultipleCatch();
        example.methodWithMultiCatch();
        example.methodWithTryCatchFinally();
    }
    // Метод с использованием try-catch
    public void methodWithTryCatch() {
        try {
            int result = 10 / 0; // Генерируем исключение деления на ноль
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        }
    }
    // Метод с использованием try-catch, где catch будет несколько
    public void methodWithMultipleCatch() {
        try {
            String str = null;
            System.out.println(str.length()); // Генерируем исключение NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Ошибка: обращение к null объекту");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        }
    }
    // Метод с использованием try-catch, с использованием multi-catch
    public void methodWithMultiCatch() {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Генерируем исключение ArrayIndexOutOfBoundsException
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за пределы массива");
        }
    }
    // Метод с использованием try-catch-finally
    public void methodWithTryCatchFinally() {
        try {
            int result = 10 / 0; // Генерируем исключение деления на ноль
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        } finally {
            System.out.println("Выполнение блока finally");
        }
    }
}
