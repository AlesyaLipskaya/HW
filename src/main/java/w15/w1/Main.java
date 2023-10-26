package w15.w1;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<User> user = Optional.empty();

        user.ifPresentOrElse(
                u -> System.out.println(u.getName()),
                () -> System.out.println("DEFAULT")
        );
    }
}
