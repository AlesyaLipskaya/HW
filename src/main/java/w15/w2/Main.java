package w15.w2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Яблоко", "Банан", "Авокадо", "Апельсин");

        StreamExample.filterStringsStartingWithA(strings);
    }
}
