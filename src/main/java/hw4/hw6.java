package hw4;
import java.util.Arrays;
public class hw6 {
    public static void main(String[] args) {
        System.out.println( "6 задание" );
    int[] task_6 = {1, 2, 3, 4, 5};
    boolean arg = true;
        for (int i = 1; i < task_6.length; i++) {
        if (task_6[i] <= task_6[i - 1]) {
            arg = false;
            break;
        }
    }
            if(arg){
        System.out.println("возрастающяя последовательность");
    } else {
        System.out.println("не возрастающяя последовательность");
    }
}
}
