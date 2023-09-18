package w8.p2;

public class Person {
    public String name;
    int age;
    private String gender;
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
}