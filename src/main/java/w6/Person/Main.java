package w6.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFullName("Алеся");
        person1.setAge(25);

        Person person2 = new Person("TMS", 30);

        person1.move();
        person1.talk("Привет!");

        person2.move();
        person2.talk("Приятно познакомиться!");
    }
}
