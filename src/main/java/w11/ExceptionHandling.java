package w11;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); // Вызов исключения ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс выходит за границы массива");
        } catch (ArithmeticException e) {
            System.out.println("Арифметическая ошибка");
        }
        try {
            int result = 10 / 0; // Вызов исключения ArithmeticException
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Произошла ошибка");
        }
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); // Вызов исключения ArrayIndexOutOfBoundsException
            int result = 10 / 0; // Вызов исключения ArithmeticException
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Произошла ошибка");
        }
    }
}

