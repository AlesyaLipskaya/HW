package w12;

import java.util.Arrays;
import java.util.Comparator;

public class Main2 {
    public static void main(String[] args) {
        // Создаем массив студентов
        Student2[] students = new Student2[6];
        students[0] = new Student2("Группа n11", "Саша", 20);
        students[1] = new Student2("Группа n13", "Алеся", 22);
        students[2] = new Student2("Группа n11", "Маша", 19);
        students[3] = new Student2("Группа n12", "Коля", 21);
        students[4] = new Student2("Группа n31", "Петя", 18);
        students[5] = new Student2("Группа n22", "Даник", 23);

        // Сортируем массив студентов
        Arrays.sort(students, new Comparator<Student2>() {
            @Override
            public int compare(Student2 student1, Student2 student2) {
                int result = student1.getGroup().compareTo(student2.getGroup());
                if (result == 0) {
                    result = Integer.compare(student1.getAge(), student2.getAge());
                    if (result == 0) {
                        result = student1.getLastName().compareTo(student2.getLastName());
                    }
                }
                return result;
            }
        });

        // Выводим отсортированный массив студентов
        for (Student2 student : students) {
            System.out.println("Группа: " + student.getGroup() + ", Имя: " + student.getLastName() + ", Возраст: " + student.getAge());
        }
    }
}
