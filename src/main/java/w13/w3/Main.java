package w13.w3;

import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        HashSet<Person> people = new HashSet<>();
        Person person1 = new Person("Алеся");
        Person person2 = new Person("Саша");
        Person person3 = new Person("Женя");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        for (Person person: people)
            System.out.println(person.getName());
        people.remove(person2);
        people.remove(person3);
        for (Person person: people)
            System.out.println("ИТОГО: " + person.getName());
    }
}

