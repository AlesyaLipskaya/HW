package w15.w3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Developer> developers = Arrays.asList(
                new Developer(1, "Andrew"),
                new Developer(15, "Anna"),
                new Developer(5, "Fill"),
                new Developer(20, "Jo")
        );

        StreamExample.filterDevelopersByIdAndName(developers);
    }
}

