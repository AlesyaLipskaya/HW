package w15.w3;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void filterDevelopersByIdAndName(List<Developer> developers) {
        List<Developer> filteredDevelopers = developers.stream()
                .filter(d -> d.getId() > 10 && d.getName().startsWith("An"))
                .collect(Collectors.toList());

        filteredDevelopers.forEach(System.out::println);
    }
}