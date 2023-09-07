package hw4;
import java.util.Arrays;

public class hw1 {

    public static void main (String[] args) {

        System.out.println("1 задача");
        double[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(number));
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print("Элементы в прямом и обратном порядке" + number[i] + " ");
        }
}
}
