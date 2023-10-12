package hw13.w2;

public class Main {
    public static void main(String[] args) {
        AnimalCollection animalCollection = new AnimalCollection();

        animalCollection.addAnimal("Собака");
        animalCollection.addAnimal("Кошка");
        animalCollection.addAnimal("Лошадь");

        System.out.println("Исходная коллекция:");
        animalCollection.printAnimals();

        animalCollection.removeAnimal();

        System.out.println("Коллекция после удаления:");
        animalCollection.printAnimals();
    }
}