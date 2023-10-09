package w13.w4;

public class Main {
    public static void main(String[] args) {
        Storage<String> stringStorage = new Storage<>("Добро пожаловать");
        Storage<Integer> integerStorage = new Storage<>(13);

        System.out.println(stringStorage.getItem());
        System.out.println(integerStorage.getItem());
    }
}
