package hw4;
import java.util.Arrays;
public class hw5 {
    public static void main(String[] args) {
        System.out.println( "5 задание" );
        int[] z5 = new int[8];
        for (int i = 0; i < 8; i++) {
            z5[i] = (int) (Math.random() * 15 - 8);
        }
        System.out.println(Arrays.toString(z5));
        int y;
        int x;
        for (y = 0, x = z5.length-1; y < z5.length && x >= 0; y++, x--) {
            z5[y] = z5[x];
        }
        System.out.println(Arrays.toString(z5));
}
}