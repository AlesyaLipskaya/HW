package hw9;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.voice();
        animal.eat("Мясо");

        Dog dog = new Dog();
        dog.voice();
        dog.eat("Мясо");

        Tiger tiger = new Tiger();
        tiger.voice();
        tiger.eat("Трава");

        Rabbit rabbit = new Rabbit();
        rabbit.voice();
        rabbit.eat("Трава");
    }
}
