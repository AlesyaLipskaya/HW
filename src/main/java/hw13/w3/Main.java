package hw13.w3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Добавление студентов в коллекцию
        students.add(new Student("Липская", "Группа 1", 1, List.of(4.5, 3.2, 4.0)));
        students.add(new Student("Петров", "Группа 2", 2, List.of(3.8, 3.9, 4.1)));
        students.add(new Student("Сидоров", "Группа 2", 2, List.of(2.5, 3.1, 2.9)));
        students.add(new Student("Смирнов", "Группа 3", 3, List.of(4.6, 4.8, 4.7)));

        removeStudentsWithLowAverage(students);
        moveStudentsToNextCourse(students);

        printStudents(students, 1);
    }

    public static void removeStudentsWithLowAverage(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            }
        }
    }

    public static void moveStudentsToNextCourse(List<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.getcourse++;
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты, обучающиеся на " + course + " курсе:");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
