package w5;
import java.util.Arrays;
import java.util.Random;
public class w1 {
        public static void main(String[] args) {

            System.out.println("1.1 задача");
            int n = 3;
            int m = 4;
            int max=0;
            int[][] w1 = new int[n][m];
            Random random = new Random();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    w1[i][j] = random.nextInt(10);
                }
            }
            System.out.print(Arrays.deepToString(w1));

            for(int i = 0; i<w1.length; i++){
                for(int j = 0; j<w1[i].length; j++){
                    if (max < w1[i][j]){
                        max= w1[i][j];
                    }
                }
            }
            System.out.println("Макс = " + max);
        }
}
