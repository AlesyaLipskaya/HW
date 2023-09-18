package w8.p2;
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alesya", 22, "Women");
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.getGender());
    }
}
