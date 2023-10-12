package hw13.w2;
import java.util.LinkedList;

public class AnimalCollection {
    private LinkedList<String> animals;

    public AnimalCollection() {
        animals = new LinkedList<>();
    }

    public void addAnimal(String animal) {
        animals.addFirst(animal);
    }

    public void removeAnimal() {
        if (!animals.isEmpty()) {
            animals.removeLast();
        }
    }

    public void printAnimals() {
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}