package hw4;
import java.util.Arrays;

public class hw4 {

    public static void main(String[] args) {
        System.out.println( "4 задание" );
    int[] mass = new int[10];
        for (int i = 0; i < 10; i++) {
        mass[i] = (int) (Math.random() * 29 - 15);
    }
        System.out.println(Arrays.toString(mass));
    int nul = 0;
        for (int i = 0; i < 10; i++) {
        if (mass[i] == 0) {
            nul++;
        }
    }
        if (nul > 0) {
        System.out.println("нулевые: " + nul);
    } else {
        System.out.println("нет нулевых");
    }
}
}
