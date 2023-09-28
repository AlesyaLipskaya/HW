package w11;

public class Person {
    private int age;
    public Person(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Возраст должен быть больше или равен 18");
        }
        this.age = age;
    }
    public static void main(String[] args) {
        try {
            Person person1 = new Person(16); // Создание объекта Person с возрастом меньше 18
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
        try {
            Person person2 = new Person(20); // Создание объекта Person с возрастом больше или равным 18
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
