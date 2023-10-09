package w12;
import java.io.*;

public class Student implements Serializable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String groupA, String smith, int i) {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
