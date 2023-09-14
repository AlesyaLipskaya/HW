package w7;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.doVoice(); // Выводит "Гав-гав"
        cat.doVoice(); // Выводит "Мяу-мяу"
    }
}
