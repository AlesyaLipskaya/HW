package hw4;
import java.util.Arrays;
public class hw5 {
    public static void main(String[] args) {
        System.out.println( "5 задание" );
        int[] z5 = new int[8];
        for (int i = 0; i < 8; i++) {
            z5[i] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(z5));
        int y = 0;
        int t=0;
        int x = 0;
        for (y = 0, x = z5.length-1; y <= z5.length/2 && x >= z5.length/2; y++, x--) {
            t= z5[y];
            z5[y] = z5[x];
            z5[x] = t;
        }
        System.out.println(Arrays.toString(z5));
}
}