package hw4;
import java.util.Arrays;
public class hw5 {
    public static void main(String[] args) {
        System.out.println( "5 задание" );
        int[] task_5 = new int[8];
        for (int i = 0; i < 8; i++) {
            task_5[i] = (int) (Math.random() * 15 - 8);
        }
        System.out.println(Arrays.toString(task_5));
        int y;
        int x;
        for (y = 0, x = task_5.length-1; y < task_5.length && x >= 0; y++, x--) {
            task_5[y] = task_5[x];
        }
        System.out.println(Arrays.toString(task_5));
}
}