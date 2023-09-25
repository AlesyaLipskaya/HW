package work4;

import java.util.Arrays;

public class w2 {
    public static void main (String[] args) {
        String[] fruits  = new String[] {"Яблоко", "Апельсин", "Слива", "Груша"};
        System.out.println("второй и четвертый = " + fruits[1] + "," + fruits[3]);
        System.out.println("длина массива = " + fruits.length);
        fruits[2] = "Дыня";
        System.out.println( "по итогу: " + Arrays.toString(fruits));
    }
    }
