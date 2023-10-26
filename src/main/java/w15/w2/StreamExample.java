package w15.w2;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void filterStringsStartingWithA(List<String> strings) {
        List<String> filteredStrings = strings.stream()
                .filter(s -> s.startsWith("А"))
                .collect(Collectors.toList());

        filteredStrings.forEach(System.out::println);
    }
}